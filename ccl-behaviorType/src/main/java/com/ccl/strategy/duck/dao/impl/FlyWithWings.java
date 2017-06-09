package com.ccl.strategy.duck.dao.impl;

import com.ccl.strategy.duck.dao.FlyBehavior;

/**
 * Created by ccl on 17/6/9.
 */
public class FlyWithWings implements FlyBehavior {
    public void  fly(){
        //实现了所有有翅膀的鸭子飞行行为。
        System.out.println("实现了所有有翅膀的鸭子飞行行为");
    }
}
