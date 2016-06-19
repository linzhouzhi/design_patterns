package com.mycompany.app.command;

/**
 * Created by lzz on 6/19/16.
 */
public class TVOffCommand implements Command {
    TV tv;
    public TVOffCommand(TV tv ){
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }
}
