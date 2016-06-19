package com.mycompany.app.strategy;

/**
 * Created by lzz on 6/18/16.
 */
public class APP {
    public static void main( String[] args ){
        Duck duck = new RedheadDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
