package com.ccl.strategy.duck;

import com.ccl.strategy.duck.dao.impl.FlyNoWay;
import com.ccl.strategy.duck.dao.impl.MuteQuack;

/**
 * Created by ccl on 17/6/9.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    public void display() {
        System.out.println("红头鸭的颜色...");
    }
}
