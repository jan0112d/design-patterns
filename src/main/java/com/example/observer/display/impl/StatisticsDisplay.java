package com.example.observer.display.impl;

import com.example.observer.display.DisplayElement;
import com.example.observer.observable.impl.WeatherData;

import java.util.Observable;
import java.util.Observer;

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

    private Observable observable;

    public StatisticsDisplay(Observable o) {
        this.observable = o;
        o.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: temperature:" + temperature + ", humidity:" + humidity);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
