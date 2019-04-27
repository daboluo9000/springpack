package com.johnson.spring.EL;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
@ComponentScan("com.johnson.spring.EL")
@PropertySource("classpath:test.properties")
public class ELConfig {

    @Value("I love u")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osname;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomeNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource resource;

    @Value("http://www.baidu.com")
    private Resource testURL;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourceConfig(){
        return new PropertySourcesPlaceholderConfigurer();

    }

    public void getResources(){
        try {
            System.out.println(normal);
            System.out.println(osname);
            System.out.println(randomeNumber);
            System.out.println(fromAnother);
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
            System.out.println(IOUtils.toString(resource.getInputStream()));
            System.out.println(IOUtils.toString(testURL.getInputStream()));




        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

