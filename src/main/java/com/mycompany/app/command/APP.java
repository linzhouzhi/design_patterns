package com.mycompany.app.command;

/**
 * Created by lzz on 6/19/16.
 */
public class APP {
    public static  void main( String[] args ){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        TV tv = new TV();
        LightOnCommand lightOnCommand = new LightOnCommand( light );
        LightOffCommand lightOffCommand = new LightOffCommand( light );
        TVOnCommand tvOnCommand = new TVOnCommand( tv );
        TVOffCommand tvOffCommand = new TVOffCommand( tv );
        simpleRemoteControl.setCommand( 0, lightOnCommand, lightOffCommand );
        simpleRemoteControl.setCommand( 1, tvOnCommand, tvOffCommand );
        simpleRemoteControl.onButtonWasPressed( 0 );
        simpleRemoteControl.offButtonWasPressed( 0 );
        simpleRemoteControl.onButtonWasPressed( 1 );
        simpleRemoteControl.offButtonWasPressed( 1 );
    }
}
