package com.designpatterns.decorator.model;

import com.designpatterns.decorator.abs.Beverage;

/**
 * 浓缩咖啡
 *
 * @author wll
 * @data 2020/06/03
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
