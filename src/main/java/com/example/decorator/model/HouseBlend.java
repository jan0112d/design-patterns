package com.example.decorator.model;

import com.example.decorator.abs.Beverage;

/**
 * 混合
 *
 * @author wll
 * @data 2020/06/03
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.setDescription("House Blend coffee");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
