package com.mycompany.app.decorator;

/**
 * Created by lzz on 6/18/16.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha( Beverage beverage ){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha ";
    }

    public double cost() {
        return 1.1 + beverage.cost();
    }
}
