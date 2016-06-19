package com.mycompany.app.state;

/**
 * Created by lzz on 6/19/16.
 */
public class APP {
    public static void main( String[] args ){
        GumballMachine gumballMachine = new GumballMachine( 5 );
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
