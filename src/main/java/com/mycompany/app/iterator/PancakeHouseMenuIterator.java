package com.mycompany.app.iterator;

import java.util.ArrayList;

/**
 * Created by lzz on 6/19/16.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.items = menuItems;
    }

    public boolean hasNext() {
        if( position >= items.size() || items.get( position ) == null ){
            return false;
        }else{
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = items.get( position );
        position = position + 1;
        return menuItem;
    }
}
