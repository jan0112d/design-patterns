package com.example.observer.display.impl;

import com.example.observer.display.DisplayElement;
import com.example.observer.observer.Observer;
import com.example.observer.subject.Subject;

/**
 * @author wll
 * @data 2020/06/01
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: temperature:" + temperature + ", humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float perssure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
