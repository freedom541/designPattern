package com.ccl.factory.normalFactory;

/**
 * Created by ccl on 17/6/8.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        //Sender sender = factory.produce("sms");
        Sender sender = StaticSendFactory.produceMail();
        sender.Send();


    }
}