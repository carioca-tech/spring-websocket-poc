package com.ltavares.demo.web.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.*;

/**
 * Created by Luiz on 19/09/2015.
 */
public class DefaultHandler implements WebSocketHandler {

    Logger logger = LoggerFactory.getLogger(DefaultHandler.class);
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("afterConnectionEstablished");
        session.sendMessage(new TextMessage("Hi"));
        //session.sendMessage(new PingMessage());
        logger.info("sent");
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        logger.info("handleMessage");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        logger.info("handleTransportError", exception);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        logger.info("afterConnectionClosed");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
