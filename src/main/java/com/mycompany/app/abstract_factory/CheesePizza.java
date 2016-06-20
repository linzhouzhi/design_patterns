package com.mycompany.app.abstract_factory;

/**
 * Created by lzz on 6/20/16.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza( PizzaIngredientFactory pizzaIngredientFactory ){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
