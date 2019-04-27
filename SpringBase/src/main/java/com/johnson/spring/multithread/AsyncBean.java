package com.johnson.spring.multithread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncBean {

    @Async
    public void task1() throws InterruptedException {
        System.out.println("Task1 Running....");
//        Thread.sleep(1000);
    }

    @Async
    public void task2(){
        System.out.println("Task2 Running....");
    }


    @Async
    public void task3(){
        System.out.println("Task3 Running...");
    }
}
