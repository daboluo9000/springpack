package com.johnson.spring.beanInit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        BeanWayService bws = context.getBean(BeanWayService.class);
        JSR250BeanWay jsr250 = context.getBean(JSR250BeanWay.class);
        context.close();
    }
}
