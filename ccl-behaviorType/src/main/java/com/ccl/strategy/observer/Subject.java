package com.ccl.strategy.observer;

/**
 * Created by ccl on 17/6/9.
 */
public interface Subject{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notice();
}
