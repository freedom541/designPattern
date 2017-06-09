package com.ccl.strategy.duck.dao.impl;

import com.ccl.strategy.duck.dao.QuackBehavior;

/**
 * Created by ccl on 17/6/9.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        //什么都不做，不会叫
        System.out.println("什么都不做，不会叫");
    }
}
