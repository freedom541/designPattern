package com.ccl.factory;

/**
 * Created by ccl on 17/6/8.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
