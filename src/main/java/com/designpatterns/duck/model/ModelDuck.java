package com.designpatterns.duck.model;

import com.designpatterns.duck.fly.impl.FlyNoWay;
import com.designpatterns.duck.quack.impl.Quack;

/**
 * 模型鸭
 *
 * @author wll
 * @data 2020/05/29
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
