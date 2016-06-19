package com.mycompany.app.command;

/**
 * Created by lzz on 6/19/16.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand( Light light ){
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
