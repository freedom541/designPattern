package com.ccl.structural.adapter;

/**
 * Created by ccl on 17/6/8.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
