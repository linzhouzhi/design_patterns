package com.mycompany.app.strategy;

/**
 * Created by lzz on 6/18/16.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println( "i am quack" );
    }
}
