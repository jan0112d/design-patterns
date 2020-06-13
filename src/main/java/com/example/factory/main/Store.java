package com.example.factory.main;

import com.example.factory.pizzafm.ChicagoPizzaStore;
import com.example.factory.pizzafm.NYPizzaStore;
import com.example.factory.pizzafm.Pizza;
import com.example.factory.pizzafm.PizzaStore;

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
