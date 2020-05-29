package com.example.duck.main;

import com.example.duck.fly.impl.FlyRocketPowered;
import com.example.duck.model.Duck;
import com.example.duck.model.MallardDuck;
import com.example.duck.model.ModelDuck;

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
