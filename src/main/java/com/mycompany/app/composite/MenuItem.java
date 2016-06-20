package com.mycompany.app.composite;

/**
 * Created by lzz on 6/20/16.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem( String name,String description,boolean vegetarian, double price ){
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.print( " " + getName() );
        if( isVegetarian() ) {
            System.out.print( "(v)" );
        }
        System.out.print( ", " + getPrice() );
        System.out.print( "  __ " + getDescription() );
    }
}
