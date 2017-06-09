package com.ccl.structural.adapter;

/**
 * Created by ccl on 17/6/8.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
