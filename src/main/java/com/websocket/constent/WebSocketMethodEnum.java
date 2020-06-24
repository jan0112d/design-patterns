package com.websocket.constent;

/**
 * @author wll
 * @data 2020/06/24
 */
public enum WebSocketMethodEnum {
    /**
     * 初始化
     */
    INIT("init", "初始化"),
    INIT_OK("initOK", "初始化成功"),
    HEART_BEAT("Heartbeat", "心跳"),
    EXIT("exit", "退出"),
    ERROR("error", "错误");

    private String code;
    private String desc;

    WebSocketMethodEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}