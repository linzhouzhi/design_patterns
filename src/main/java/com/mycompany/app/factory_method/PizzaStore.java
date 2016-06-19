package com.mycompany.app.factory_method;

/**
 * Created by lzz on 6/19/16.
 */
public abstract class PizzaStore {
    Pizza pizza;
    public Pizza orderPizza( String type ){
        Pizza pizza;
        pizza = createPiza( type );
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPiza(String type);
}
