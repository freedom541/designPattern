package com.ccl.strategy.duck.dao.impl;

import com.ccl.strategy.duck.dao.QuackBehavior;

/**
 * Created by ccl on 17/6/9.
 */
public class Squeak implements QuackBehavior {
    public void quack(){
        //实现吱吱叫的鸭子
        System.out.println("实现吱吱叫的鸭子");
    }
}
