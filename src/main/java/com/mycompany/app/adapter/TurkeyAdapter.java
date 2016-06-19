package com.mycompany.app.adapter;

/**
 * Created by lzz on 6/19/16.
 */
public class TurkeyAdapter implements Duck {
    Trukey trukey;
    public TurkeyAdapter( Trukey trukey ){
        this.trukey = trukey;
    }
    public void quack() {
        trukey.gobble();
    }

    public void fly() {
        trukey.fly();
    }
}
