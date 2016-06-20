package com.mycompany.app.abstract_factory;

/**
 * Created by lzz on 6/20/16.
 */
public abstract  class Pizza {
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    abstract void prepare();
}
