package com.designpatterns.duck.quack.impl;

import com.designpatterns.duck.quack.QuackBehavior;

/**
 * @author wll
 * @data 2020/05/29
 */
public class Squeak implements QuackBehavior {

    /**
     * 橡皮鸭子吱吱叫
     */
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
