package com.johnson.spring.application.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListenerBean implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("DemoListBean got message : "+demoEvent.getMsg());
    }
}
