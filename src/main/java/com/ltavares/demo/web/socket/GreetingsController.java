package com.ltavares.demo.web.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by Luiz on 19/09/2015.
 */
@Controller
@MessageMapping("/chat")
public class GreetingsController {

    @Autowired
    private SimpMessagingTemplate messageTemplate;


    Logger logger = LoggerFactory.getLogger(GreetingsController.class);

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @MessageMapping
    @SendTo("/topic/greetings")
    public String handle() {

        try {
            Thread.sleep(3000); // simulated delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("handle");
        return "Hello from server";
    }
}
