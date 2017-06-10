package com.solidarize.scheduler.listener;

import com.solidarize.scheduler.client.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextListener {

    @Autowired
    private NotificationClient client;

    @EventListener(ContextRefreshedEvent.class)
    void contextRefreshedEvent() {
        client.createReport();
    }
}
