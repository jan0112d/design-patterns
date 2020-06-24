package com.designpatterns.factory.pizzaaf;

import com.designpatterns.factory.pizzas.ClamPizza;
import com.designpatterns.factory.pizzas.PepperoniPizza;
import com.designpatterns.factory.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        }
        return pizza;
    }
}