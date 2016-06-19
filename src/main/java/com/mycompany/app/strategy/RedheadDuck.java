package com.mycompany.app.strategy;

/**
 * Created by lzz on 6/18/16.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println( "i am is read head duck" );
    }
}
