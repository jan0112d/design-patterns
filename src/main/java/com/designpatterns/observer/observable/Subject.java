package com.designpatterns.observer.observable;


import com.designpatterns.observer.observer.Observer;

/**
 * @author wll
 * @data 2020/05/29
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

}
