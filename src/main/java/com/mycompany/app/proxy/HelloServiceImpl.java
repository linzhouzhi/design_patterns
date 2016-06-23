package com.mycompany.app.proxy;

/**
 * Created by lzz on 6/22/16.
 */
public class HelloServiceImpl implements HelloService{

    public String hello(String name) {
        return "hello " + name;
    }
}
