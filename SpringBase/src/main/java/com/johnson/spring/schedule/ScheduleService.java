package com.johnson.spring.schedule;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ScheduleService {

    private DateTime dt;

    @Scheduled(fixedRateString = "5000")
    public void schedService(){
        System.out.println("The schedule is running at "+ DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(new DateTime().getMillis()));
    }




}
