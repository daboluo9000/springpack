package com.johnson.spring.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.johnson.spring.schedule")
@EnableScheduling
public class ScheduleConfig {

}
