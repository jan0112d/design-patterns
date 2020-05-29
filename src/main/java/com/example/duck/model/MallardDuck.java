package com.example.duck.model;

import com.example.duck.fly.impl.FlyWithWings;
import com.example.duck.quack.impl.Quack;

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
