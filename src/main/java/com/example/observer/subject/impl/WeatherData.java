package com.example.observer.subject.impl;

import com.example.observer.observer.Observer;
import com.example.observer.subject.Subject;

import java.util.ArrayList;

/**
 * @author wll
 * @data 2020/05/29
 */
public class WeatherData implements Subject {

    /**
     * 温度
     */
    public float temperature;

    /**
     * 湿度
     */
    public float humidity;

    /**
     * 压强
     */
    public float pressure;

    private ArrayList observers;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    /**
     * 注册
     *
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    /**
     * 移除
     *
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 测量
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
