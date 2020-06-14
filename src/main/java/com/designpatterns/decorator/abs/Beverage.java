package com.designpatterns.decorator.abs;

import lombok.Data;

/**
 * 饮料
 *
 * @author wll
 * @data 2020/06/03
 */
@Data
public abstract class Beverage {

    String description = "Unknown Beverage";

    /**
     * 费用
     */
    public abstract double cost();
}
