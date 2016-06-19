package com.mycompany.app.state;

/**
 * Created by lzz on 6/19/16.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    public HasQuarterState( GumballMachine gumballMachine ){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuater() {
        System.out.println( "you can't insert another quarter" );
    }

    public void ejectQuater() {
        System.out.println( "quarter returned" );
        gumballMachine.setState( gumballMachine.getNoQuarterState() );
    }

    public void turnCrank() {
        System.out.println( "you turned...." );
        gumballMachine.setState( gumballMachine.getSoldState() );
    }

    public void dispense() {
        System.out.println( "no gumball dispensed" );
    }
}
