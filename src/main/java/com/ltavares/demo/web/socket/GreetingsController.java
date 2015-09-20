package com.ltavares.demo.web.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by Luiz on 19/09/2015.
 */
@Controller
@MessageMapping("/greeting")
public class GreetingsController {


    Logger logger = LoggerFactory.getLogger(GreetingsController.class);

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @MessageMapping
    public String handle(String greeting) {
        logger.info("handle");
        return "[" + new Date().toString() + ": " + greeting;
    }
}
