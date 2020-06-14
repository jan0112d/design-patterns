package com.designpatterns.duck.model;

import com.designpatterns.duck.fly.FlyBehavior;
import com.designpatterns.duck.quack.QuackBehavior;

/**
 * @author wll
 * @data 2020/05/29
 */
public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void swim() {
        System.out.println("游泳");
    }

    public void display() {
        System.out.println("外表");
    }

}
