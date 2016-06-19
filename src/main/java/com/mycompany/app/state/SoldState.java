package com.mycompany.app.state;

/**
 * Created by lzz on 6/19/16.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState( GumballMachine gumballMachine ){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuater() {
        System.out.println( "please wait,we're already giving you a gumball" );
    }

    public void ejectQuater() {
        System.out.println( "sorray, you already turned the crank" );
    }

    public void turnCrank() {
        System.out.println( "turning twice doesn't get you another gumball" );
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if( gumballMachine.getCount() > 0 ){
            gumballMachine.setState( gumballMachine.getNoQuarterState() );
        }else{
            System.out.println( "Oops , out of gumballs" );
            gumballMachine.setState( gumballMachine.getSoldOutState() );
        }
    }
}
