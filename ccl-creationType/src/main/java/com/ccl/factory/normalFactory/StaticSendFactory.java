package com.ccl.factory.normalFactory;

/**
 * Created by ccl on 17/6/8.
 */
public class StaticSendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
