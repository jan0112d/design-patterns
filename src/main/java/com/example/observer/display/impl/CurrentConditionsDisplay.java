package com.example.observer.display.impl;

import com.example.observer.display.DisplayElement;
import com.example.observer.observable.impl.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 现状
 *
 * @author wll
 * @data 2020/05/30
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;


    private Observable observable;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public CurrentConditionsDisplay(Observable o) {
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getTemperature();
            display();
        }
    }
}
