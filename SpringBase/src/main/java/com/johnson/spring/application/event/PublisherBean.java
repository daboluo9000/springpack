package com.johnson.spring.application.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PublisherBean {

    @Autowired
    ApplicationContext context;

    public void publishMsg(){
        context.publishEvent(new DemoEvent(this, "I'm PublisherBean"));
    }
}
