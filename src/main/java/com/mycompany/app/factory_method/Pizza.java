package com.mycompany.app.factory_method;

import java.util.ArrayList;

/**
 * Created by lzz on 6/19/16.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    void prepare(){
        System.out.println( "preparing " + name );
        System.out.println( "tossing dough...." );
        System.out.println( "adding sauce..." );
        System.out.println( "adding topings: ");
        for ( int i = 0; i< toppings.size(); i++ ){
            System.out.println( " " + toppings.get( i ) );
        }
    }

    void bake(){
        System.out.println( "bake for 25 minutes at 350" );
    }

    void cut(){
        System.out.println( "cutting the pizza into diagonal slices" );
    }

    void box(){
        System.out.println( "place pizza in official pizzastore box" );
    }

    public String getName(){
        return name;
    }

}
