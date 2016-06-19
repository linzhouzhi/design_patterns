package com.mycompany.app.template_method;

/**
 * Created by lzz on 6/19/16.
 */
public class APP {
    public static void main( String[] args ){
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println( "making coffee..." );
        coffeeWithHook.prepareRecipe();
    }
}
