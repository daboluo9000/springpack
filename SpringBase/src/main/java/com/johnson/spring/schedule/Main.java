package com.johnson.spring.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        ScheduleService ss = context.getBean(ScheduleService.class);
    }
}
