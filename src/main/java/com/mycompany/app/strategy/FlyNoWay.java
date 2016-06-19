package com.mycompany.app.strategy;

/**
 * Created by lzz on 6/18/16.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("i can not fly!");
    }
}
