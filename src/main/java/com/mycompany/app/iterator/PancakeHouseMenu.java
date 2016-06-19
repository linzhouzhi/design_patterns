package com.mycompany.app.iterator;

import java.util.ArrayList;

/**
 * Created by lzz on 6/19/16.
 */
public class PancakeHouseMenu {
    ArrayList menuItems;
    public PancakeHouseMenu(){
        menuItems = new ArrayList();
        addItem( "K&B's pancake breakfast","pancake with scramebel eggs and toast", true,2.99);
        addItem( "Regular Pancake Breakfast", "Pancakes with fried eggs sausage", false,2.99);
        addItem( "Blueberry Pancakes", "Pancakes made with fresh bluberries", true, 3.49);
        addItem( "waffles", "waffles, with your choice ofblueberries or stawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem( name, description, vegetarian, price );
        menuItems.add( menuItem );
    }
    public ArrayList getMenuItems(){
        return menuItems;
    }

    public Iterator createiterator(){
        return new PancakeHouseMenuIterator( menuItems );
    }
}
