package com.mycompany.app.factory_method;

/**
 * Created by lzz on 6/19/16.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "chicago style deep dish cheese pizza";
        dough = "extra thick crust dough";
        sauce = "plum tomato sauce";

        toppings.add( "shredded mozzarella cheese" );
    }
    void cut(){
        System.out.println( "cutting the pizza into square slices" );
    }
}
