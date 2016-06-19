package com.mycompany.app.iterator;

/**
 * Created by lzz on 6/19/16.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[ MAX_ITEMS ];
        addItem( "Vegetaruab BLT","Bacon with lettuce & tomato on whole wheat", true,2.99 );
        addItem( "BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem( "soup of the day","soup of the day,with a side of potato salad", false,2.99);
        addItem( "Hotdog","A hot dog, with saurkraut, relish onions,topped with cheese", false,3.05);
    }

    public void addItem( String name, String description, boolean vegetarian, double price ) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if( numberOfItems >= MAX_ITEMS ){
            System.err.println("sorry, menu is full, can't add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }

    public Iterator createiterator(){
        return new DinerMenuIterator( menuItems );
    }
}
