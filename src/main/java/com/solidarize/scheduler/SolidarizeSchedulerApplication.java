package com.solidarize.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SolidarizeSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidarizeSchedulerApplication.class, args);
    }
}
