package com.designpatterns.factory.pizzafm;

/**
 * @author wll
 * @data 2020/06/13
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleChessePizza();
        } else {
            return null;
        }
    }
}
