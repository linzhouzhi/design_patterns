package com.mycompany.app.command;

import com.mycompany.app.decorator.CondimentDecorator;

/**
 * Created by lzz on 6/19/16.
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}
    public void setCommand( Command command ){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
