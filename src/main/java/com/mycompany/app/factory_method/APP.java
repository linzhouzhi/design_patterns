package com.mycompany.app.factory_method;

/**
 * Created by lzz on 6/19/16.
 */
public class APP {
    public static void main( String[] args ){
        PizzaStore nyStore = new NYPizzaStore();
        Pizza  pizza = nyStore.orderPizza( "cheese" );
        System.out.println( "order a " + pizza.getName() );
    }
}
