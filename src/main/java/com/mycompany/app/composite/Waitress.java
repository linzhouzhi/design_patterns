package com.mycompany.app.composite;

/**
 * Created by lzz on 6/20/16.
 */
public class Waitress {
    MenuComponent allMenus;
    public Waitress( MenuComponent allMenus ){
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
