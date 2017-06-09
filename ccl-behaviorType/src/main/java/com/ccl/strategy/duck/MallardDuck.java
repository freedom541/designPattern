package com.ccl.strategy.duck;

import com.ccl.strategy.duck.dao.impl.FlyWithWings;
import com.ccl.strategy.duck.dao.impl.Quack;

/**
 * Created by ccl on 17/6/9.
 */
public class MallardDuck extends Duck{
    //----->通过构造方法,生成'飞','叫'具体实现类的实例,从而指定'飞','叫'的具体属性
    public MallardDuck() {
        //因为MallardDuck 继承了Duck，所有具有flyBehavior 与quackBehavior 实例变量}
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("野鸭的颜色...");
    }
}
