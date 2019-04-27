package com.johnson.spring.conditions;

import org.springframework.stereotype.Service;


public class LinuxService implements IService{
    public void service(){
        System.out.println("this is linux service");
    }
}
