package com.ccl.strategy.observer;

import java.util.Vector;

/**
 * Created by ccl on 17/6/9.
 */
public class Teacher implements Subject{
    private String phone;
    private Vector students;
    public Teacher(){
        phone = "";
        students = new Vector();
    }
    public  void attach(Observer o){
        students.add(o);
    }
    public void detach(Observer o){
        students.remove(o);
    }
    public void notice(){
        for(int i=0;i<students.size();i++)
            ((Observer)students.get(i)).update();
    }
    public void setPhone(String phone){
        this.phone = phone;
        notice();    //--关键
    }
    public String getPhone(){
        return phone;
    }
}
