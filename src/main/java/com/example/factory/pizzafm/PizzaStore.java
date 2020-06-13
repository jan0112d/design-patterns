package com.example.factory.pizzafm;

public abstract class PizzaStore {

    /**
     * 做pizza
     */
    abstract Pizza createPizza(String item);

    /**
     * 准备
     * 烤
     * 切
     * 装
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println(pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
