package com.designpatterns.observer.observer;

/**
 * @author wll
 * @data 2020/05/29
 */
public interface Observer {

    /**
     * 旁观者更新
     *
     * @param temp
     * @param humidity
     * @param perssure
     */
    void update(float temp, float humidity, float perssure);

}
