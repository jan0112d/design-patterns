package com.designpatterns.duck.main;

import com.designpatterns.duck.fly.impl.FlyRocketPowered;
import com.designpatterns.duck.model.Duck;
import com.designpatterns.duck.model.MallardDuck;
import com.designpatterns.duck.model.ModelDuck;

/**
 * @author wll
 * @data 2020/05/29
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        mallardDuck();
        modelDuck();
    }

    /**
     * 绿头鸭
     */
    public static void mallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }

    /**
     * 模型鸭
     */
    public static void modelDuck() {
        Duck mallrad = new ModelDuck();
        mallrad.performFly();
        mallrad.setFlyBehavior(new FlyRocketPowered());
        mallrad.performFly();
    }
}
