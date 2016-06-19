package com.mycompany.app.command;

import com.mycompany.app.decorator.CondimentDecorator;

/**
 * Created by lzz on 6/19/16.
 */
public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public SimpleRemoteControl(){
        onCommands = new Command[2];
        offCommands = new Command[2];
    }
    public void setCommand( int slot, Command onCommand, Command offCommand ){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }
    public void onButtonWasPressed( int slot ){
        onCommands[ slot ].execute();
    }
    public void offButtonWasPressed( int slot ){
        offCommands[ slot ].execute();
    }
}
