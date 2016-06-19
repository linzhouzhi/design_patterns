package com.mycompany.app.command;

/**
 * Created by lzz on 6/19/16.
 */
public class APP {
    public static  void main( String[] args ){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand( light );
        simpleRemoteControl.setCommand( lightOnCommand );
        simpleRemoteControl.buttonWasPressed();
    }
}
