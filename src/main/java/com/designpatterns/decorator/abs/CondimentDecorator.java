package com.designpatterns.decorator.abs;

/**
 * 调料
 *
 * @author wll
 * @data 2020/06/03
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 获取描述
     */
    @Override
    public abstract String getDescription();
}
