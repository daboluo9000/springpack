package com.johnson.spring.multithread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoAsyncThreadsConfig.class);

        AsyncBean ab = context.getBean(AsyncBean.class);
        for (int i=0;i<10;i++) {
            ab.task1();
            ab.task2();
            ab.task3();
        }

        context.close();
    }
}
