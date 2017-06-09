package com.ccl.strategy.observer;

import java.util.Vector;

/**
 * Created by ccl on 17/6/9.
 */
public class Client{        // -->可以只定义目标者,观察者,另外的vector,只为了输入结果.
    public static void main(String[] args){
        Vector students = new Vector();
        Teacher t = new Teacher();
        for(int i= 0 ;i<10;i++){
            Student st = new Student("lili"+i,t);
            students.add(st);
            t.attach(st);
        }
        t.setPhone("123456");
        for(int i=0;i<10;i++)
            ((Student)students.get(i)).show();
        System.out.println("change----change----change----change----change----change----change----change");
        t.setPhone("78900");
        for(int i=0;i<10;i++)
            ((Student)students.get(i)).show();
    }
}
