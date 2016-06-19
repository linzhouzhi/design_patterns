package com.mycompany.app.adapter;

/**
 * Created by lzz on 6/19/16.
 */
public class APP {
    public static void main( String[] args ){
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter( turkey );
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
