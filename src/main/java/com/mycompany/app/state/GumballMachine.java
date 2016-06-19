package com.mycompany.app.state;

/**
 * Created by lzz on 6/19/16.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state = soldOutState;
    int count = 0;

    public GumballMachine( int numberGumballs ){
        soldOutState = new SoldOutState( this );
        noQuarterState = new NoQuarterState( this );
        hasQuarterState = new HasQuarterState( this );
        soldState = new SoldState( this );
        this.count = numberGumballs;
        if( numberGumballs > 0 ){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuater();
    }

    public void ejectQuarter(){
        state.ejectQuater();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState( State state ){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println( "a gumball comes rolling out the slot..." );
        if( count != 0 ){
            count = count -1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}
