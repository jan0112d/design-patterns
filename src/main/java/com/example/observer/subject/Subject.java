package com.example.observer.subject;


import com.example.observer.observer.Observer;

/**
 * @author wll
 * @data 2020/05/29
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

}
