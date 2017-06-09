package com.ccl.structural.interfaceAdapter;

/**
 * Created by ccl on 17/6/8.
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        System.out.println(source1.method1());
        System.out.println(source1.method2());
        System.out.println(source2.method1());
        System.out.println(source2.method2());
    }
}
