package com.mycompany.app.decorator;

/**
 * Created by lzz on 6/18/16.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "house blend coffee ";
    }

    public double cost() {
        return 1.98;
    }
}
