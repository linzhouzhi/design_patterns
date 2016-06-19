package com.mycompany.app.iterator;

/**
 * Created by lzz on 6/19/16.
 */
public class APP {
    public static void main( String[] args ){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress( pancakeHouseMenu, dinerMenu );
        waitress.printmenu();
    }
}
