package com.mycompany.app.factory_method;

/**
 * Created by lzz on 6/19/16.
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPiza(String type) {
        if ( type.equals("cheese") ){
            return new NYStyleCheesePizza();
        }else{
            //其它类型偷懒不写啊
            return null;
        }
    }
}
