package com.mycompany.app.decorator;

/**
 * Created by lzz on 6/18/16.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
