package com.designpatterns.duck.fly.impl;

import com.designpatterns.duck.fly.FlyBehavior;

/**
 * @author wll
 * @data 2020/05/29
 */
public class FlyRocketPowered implements FlyBehavior {
    /**
     * 火箭飞行
     */
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered");
    }
}
