package com.mycompany.app.abstract_factory;

import com.mycompany.app.factory_method.*;

/**
 * Created by lzz on 6/20/16.
 */
public class PizzaStore {
    public static void main( String[] args ){
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = new CheesePizza( pizzaIngredientFactory );
        pizza.prepare();
    }
}
