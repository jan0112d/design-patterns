package com.example.observer.display.impl;

import com.example.observer.display.DisplayElement;
import com.example.observer.observer.Observer;
import com.example.observer.subject.Subject;

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


    private Subject weatherData;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float perssure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
