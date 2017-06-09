package com.ccl.strategy.Iterator;

/**
 * Created by ccl on 17/6/9.
 */
public interface Iterator{
    /*
    Item:即是集合中的各对象的类型.若为String,即把所有的ITEM改为String,若为其它自定义的类,则改为各自定义的类
    的接口,或类. --->important.
    */
    public Item first();
    public Item next();
    public boolean isDone();
    public Item currentItem();
}
