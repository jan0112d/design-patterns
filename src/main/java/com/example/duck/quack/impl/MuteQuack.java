package com.example.duck.quack.impl;

import com.example.duck.quack.QuackBehavior;

/**
 * @author wll
 * @data 2020/05/29
 */
public class MuteQuack implements QuackBehavior {

    /**
     * 不会叫
     */
    @Override
    public void quack() {
        System.out.println("MuteQuack");
    }
}
