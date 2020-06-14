package com.designpatterns.duck.model;

import com.designpatterns.duck.fly.impl.FlyWithWings;
import com.designpatterns.duck.quack.impl.Quack;

/**
 * 绿头鸭
 *
 * @author wll
 * @data 2020/05/29
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

}
