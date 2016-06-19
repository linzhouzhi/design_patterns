package com.mycompany.app.state;

import java.lang.management.GarbageCollectorMXBean;

/**
 * Created by lzz on 6/19/16.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;
    public SoldOutState( GumballMachine gumballMachine ){
        this.gumballMachine = gumballMachine;
    }
    public void insertQuater() {
        System.out.println( "sorry you can't insert quater" );
    }

    public void ejectQuater() {
        System.out.println( "sorry you can't eject quater" );
    }

    public void turnCrank() {
        System.out.println( "sorry you can't turn crank" );
    }

    public void dispense() {
        System.out.println( "sorry you can't dispense" );
    }
}
