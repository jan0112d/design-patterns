package com.websocket.server;

import com.alibaba.fastjson.JSON;
import com.websocket.model.WebsocketView;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import sun.swing.StringUIClientPropertyKey;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author wll
 * @data 2020/06/24
 */
@Component
@ServerEndpoint(value = "/websocket/{id}")
@Slf4j
public class WebSocketServer {

    public static CopyOnWriteArraySet<WebSocketServer> webSocketSet =
            new CopyOnWriteArraySet<>();

    /**
     * 该会话的session
     */
    private Session session;

    /**
     * 会话的唯一标识
     */
    private String id;

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        log.info("onClose: session:[{}],message:[{}]", session, message);
        if (StringUtils.isBlank(message)) {
            return;
        }
        WebsocketView view = JSON.parseObject(message, WebsocketView.class);
        this.session = session;
        webSocketSet.add(this);
    }

    @OnError
    public void onError(Session session, Throwable error) {
        log.info("onError: session:[{}],e:[{}]", session, error);
        webSocketSet.remove(this);
    }

    @OnClose
    public void onClose(Session session) {
        log.info("onClose: session:[{}]", session);
        webSocketSet.remove(this);
    }

    @OnOpen
    public void onOpen(Session session) {
        log.info("onOpen: session:[{}]", session);
    }

    /**
     * 主动发送消息
     *
     * @param view
     * @param session
     */
    private void sendMessage(WebsocketView view, Session session) throws IOException {
        log.info("WsView:[{}]", view);
        session.getBasicRemote().sendText(JSON.toJSONString(view));
    }

    public static void sendMessage(String message, @PathVariable String id) throws IOException {
        for (WebSocketServer item : webSocketSet) {
            if (StringUtils.equals(item.id, id)) {
                item.session.getBasicRemote().sendText(message);
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebSocketServer)) {
            return false;
        }
        WebSocketServer that = (WebSocketServer) o;
        return Objects.equals(session, that.session) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(session, id);
    }
}
