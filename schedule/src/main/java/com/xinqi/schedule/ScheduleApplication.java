package com.xinqi.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by dell on 2016/8/25.
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ScheduleApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(ScheduleApplication.class);
//        app.setWebEnvironment(true);
//        app.run(ScheduleApplication.class);

         SpringApplication.run(ScheduleApplication.class);

    }
}
