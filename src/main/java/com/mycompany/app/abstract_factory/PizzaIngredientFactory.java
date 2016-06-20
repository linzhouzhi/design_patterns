package com.mycompany.app.abstract_factory;

/**
 * Created by lzz on 6/20/16.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
