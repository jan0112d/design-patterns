package com.designpatterns.factory.pizzaaf;

/**
 * @author wll
 * @data 2020/06/24
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
