package com.mycompany.app.singleton;

/**
 * Created by lzz on 6/19/16.
 */
public class Singleton {
    private volatile  static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if( singleton == null ){
            //同步区块
            synchronized (Singleton.class){
                //同时进入打时候就顺序执行了
                if( singleton == null ){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
