package com.soumen.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;
import java.util.concurrent.TimeUnit;

@Service
public class NotificationService {

    @Async
    public void sendTextMessage(String mobileNumber){

        sleep(10);
        // Call 3rd party Api to send a text message
        System.out.println("Text Message Sent via a different thread :: " + Thread.currentThread().getName());

        System.out.println(100/0); // introducing an Arithmetic Exception to see how things behave
    }

    private void sleep(int args){
        try {
            TimeUnit.SECONDS.sleep(args);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
