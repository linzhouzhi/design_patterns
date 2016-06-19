package com.mycompany.app.observer;

/**
 * Created by lzz on 6/18/16.
 */
public interface Subject {
    public void registerObserver( Observer o );
    public void removeObserver( Observer o );
    public void notifyObservers();
}
