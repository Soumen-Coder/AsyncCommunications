package com.soumen.async.controller;

import com.soumen.async.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam("mobileNumber") String mobileNumber){
        notificationService.sendTextMessage(mobileNumber);
        return "Message sent successfully !!! via Thread :: "+ Thread.currentThread().getName();
    }
}
