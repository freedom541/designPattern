package com.ccl.strategy.duck;

import com.ccl.strategy.duck.dao.FlyBehavior;
import com.ccl.strategy.duck.dao.QuackBehavior;

/**
 * Created by ccl on 17/6/9.
 */
public abstract class Duck { //--------->在抽象类中,声明各接口,定义各接口对应的方法.
    FlyBehavior flyBehavior;//接口
    QuackBehavior quackBehavior;//接口
    public Duck(){

    }
    public abstract void display();
    public void swim(){
        //实现游泳的行为
        System.out.println("实现游泳的行为");
    }
    public void performFly(){
        flyBehavior.fly();  //-->由于是接口,会根据继承类实现的方式,而调用相应的方法.
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
