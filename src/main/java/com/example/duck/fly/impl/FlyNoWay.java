package com.example.duck.fly.impl;

import com.example.duck.fly.FlyBehavior;

/**
 * @author wll
 * @data 2020/05/29
 */
public class FlyNoWay implements FlyBehavior {
    /**
     * 不会飞
     */
    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
