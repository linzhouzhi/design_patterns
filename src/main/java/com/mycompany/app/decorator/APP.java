package com.mycompany.app.decorator;

/**
 * Created by lzz on 6/18/16.
 */
public class APP {
    public static void main( String[] args ){
        Beverage beverage = new Espresso();
        System.out.println( beverage.getDescription() + "$" + beverage.cost() );
        beverage = new Mocha( beverage );
        System.out.println( beverage.getDescription() + "$" + beverage.cost() );
        beverage = new Mocha( beverage );
        System.out.println( beverage.getDescription() + "$" + beverage.cost() );
    }
}
