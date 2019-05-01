package com.johnson.spring.annotation;

import org.springframework.stereotype.Service;

@Service
public class MyAnnotationService {
    public void myAnnottationMethod(){
        System.out.println("Get Bean from my annotation!!!!");
    }
}
