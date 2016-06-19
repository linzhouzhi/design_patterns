package com.mycompany.app.state;

/**
 * Created by lzz on 6/19/16.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState( GumballMachine gumballMachine ){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuater() {
        System.out.println( "you insert quater" );
        gumballMachine.setState( gumballMachine.getHasQuarterState() );
    }

    public void ejectQuater() {
        System.out.println( "you have't inserted a quarter" );
    }

    public void turnCrank() {
        System.out.println( "you turned, but there's no quarter" );
    }

    public void dispense() {
        System.out.println( "you need to pay first" );
    }
}
