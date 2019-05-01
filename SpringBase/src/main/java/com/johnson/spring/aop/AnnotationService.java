package com.johnson.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {

    @Advice("This is my advice")
    public void annotationMethod(){
        System.out.println("AnnotationService is running");
    }
}
