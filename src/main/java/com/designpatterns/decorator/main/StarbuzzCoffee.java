package com.designpatterns.decorator.main;

import com.designpatterns.decorator.abs.Beverage;
import com.designpatterns.decorator.model.Espresso;
import com.designpatterns.decorator.model.Mocha;

/**
 * @author wll
 * @data 2020/06/03
 */
public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Mocha(beverage);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
