package com.johnson.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(EnvConfig.class);
        context.refresh();

        EnvBean eb = context.getBean(EnvBean.class);
        System.out.println(eb.getEnv());
    }
}
