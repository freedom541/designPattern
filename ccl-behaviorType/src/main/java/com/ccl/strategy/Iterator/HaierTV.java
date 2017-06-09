package com.ccl.strategy.Iterator;

/**
 * Created by ccl on 17/6/9.
 */
import java.util.Vector;
public class HaierTV implements Television{     //---对象
    private Vector channel;
    public HaierTV(){
        channel = new Vector();
        channel.addElement(new Item("channel 1")); //--各元素，用VECTOR存放
        channel.addElement(new Item("channel 2"));
        channel.addElement(new Item("channel 3"));
        channel.addElement(new Item("channel 4"));
        channel.addElement(new Item("channel 5"));
        channel.addElement(new Item("channel 6"));
        channel.addElement(new Item("channel 7"));
    }
    public Iterator createIterator(){
        return new Controller(channel);          //--把这个VECTOR放到迭代器中构造方法中去
    }
}
