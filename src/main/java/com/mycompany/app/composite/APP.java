package com.mycompany.app.composite;

/**
 * Created by lzz on 6/20/16.
 */
public class APP {
    public static void main( String[] args ){
        MenuComponent pancakeMenu = new Menu("pancake hourse menu","breakfast");
        MenuComponent dinnerMenu = new Menu( "dinner menu", "lunch" );
        MenuComponent cafeMenu = new Menu( "cafe menu", "dinner" );
        MenuComponent dessertMenu = new Menu( "dessert menu", "dessert of course!" );
        MenuComponent allMenus = new Menu( " All menus", "all menus combined" );
        allMenus.add( pancakeMenu );
        allMenus.add( dinnerMenu );
        allMenus.add( cafeMenu );

        dinnerMenu.add( new MenuItem(
                "pasta",
                "spaghetti with marinara sauce and a slice of sourdoug break",
                true,
                3.89
        ) );
        dinnerMenu.add( dessertMenu );
        dessertMenu.add( new MenuItem(
                "apple pie",
                "apple pie with a flakey crust topped with canilla ice cream",
                true,
                1.79
        ));

        Waitress waitress = new Waitress( allMenus );
        waitress.printMenu();
    }
}
