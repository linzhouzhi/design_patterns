package com.mycompany.app.iterator;

/**
 * Created by lzz on 6/19/16.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator( MenuItem[] items ){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items[ position ];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if( position >= items.length || items[position] == null ){
            return false;
        }else{
            return true;
        }
    }

}
