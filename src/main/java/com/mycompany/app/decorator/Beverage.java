package com.mycompany.app.decorator;

/**
 * Created by lzz on 6/18/16.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
