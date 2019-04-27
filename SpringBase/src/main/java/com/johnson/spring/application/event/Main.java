package com.johnson.spring.application.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        PublisherBean pb = context.getBean(PublisherBean.class);
        pb.publishMsg();
    }
}
