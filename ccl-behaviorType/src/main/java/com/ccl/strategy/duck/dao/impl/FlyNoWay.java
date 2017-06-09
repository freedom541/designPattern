package com.ccl.strategy.duck.dao.impl;

import com.ccl.strategy.duck.dao.FlyBehavior;

/**
 * Created by ccl on 17/6/9.
 */
public class FlyNoWay implements FlyBehavior {

    public void  fly(){
        //什么都不做，不会飞
        System.out.println("什么都不做，不会飞");
    }
}
