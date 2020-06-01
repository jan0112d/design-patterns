package com.example.observer.observable.impl;

import lombok.Getter;

import java.util.Observable;

/**
 * 需要提供：添加 删除 修改 通知
 *
 * @author wll
 * @data 2020/05/29
 */
@Getter
public class WeatherData extends Observable {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 压强
     */
    private float pressure;

    /**
     * 拉取
     */
    public void measurementsChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
