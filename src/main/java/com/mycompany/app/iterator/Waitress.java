package com.mycompany.app.iterator;

/**
 * Created by lzz on 6/19/16.
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress( PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu ){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printmenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createiterator();
        Iterator dinnerIterator = dinerMenu.createiterator();

        printMenu( pancakeIterator );
        printMenu( dinnerIterator );
    }

    private void printMenu( Iterator iterator ){
        while( iterator.hasNext() ){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print( menuItem.getName() + "," );
            System.out.print( menuItem.getPrice() + " -- " );
            System.out.println( menuItem.getDescription() );
        }
    }
}
