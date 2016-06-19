package com.mycompany.app.command;

/**
 * Created by lzz on 6/19/16.
 */
public class TVOnCommand implements Command {
    TV tv;
    public TVOnCommand( TV tv ){
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }
}
