package com.example.observer.main;

import com.example.observer.display.impl.CurrentConditionsDisplay;
import com.example.observer.display.impl.StatisticsDisplay;
import com.example.observer.subject.impl.WeatherData;

/**
 * @author wll
 * @data 2020/06/01
 */
public class WeatherStation {

    public static void main(String[] args) {
        //初始化
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(79, 80, 81.5f);
        weatherData.setMeasurements(69, 70, 71.5f);
        weatherData.setMeasurements(59, 60, 61.5f);
    }
}
