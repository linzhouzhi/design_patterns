package com.mycompany.app.command;

/**
 * Created by lzz on 6/19/16.
 */
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light ){
        this.light = light;
    }
    public void execute() {
        light.off();
    }
}
