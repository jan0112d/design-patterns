package com.designpatterns.factory.main;

import com.designpatterns.factory.pizzafm.ChicagoPizzaStore;
import com.designpatterns.factory.pizzafm.NYPizzaStore;
import com.designpatterns.factory.pizzafm.Pizza;
import com.designpatterns.factory.pizzafm.PizzaStore;

/**
 * @author wll
 * @data 2020/06/13
 */
public class Store {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza nyCheese = nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza chicagoCheese = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("------------------------------------");
        System.out.println(nyCheese.toString());
        System.out.println("------------------------------------");
        System.out.println(chicagoCheese.toString());
        System.out.println("------------------------------------");
    }
}
