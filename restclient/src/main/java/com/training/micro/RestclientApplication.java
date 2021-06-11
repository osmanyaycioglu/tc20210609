package com.training.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients
public class RestclientApplication {

    @Scheduled(fixedDelay = 5_000, initialDelay = 2_000)
    public void period() {
        System.out.println("Period...");
    }

    public static void main(final String[] args) {
        SpringApplication.run(RestclientApplication.class,
                              args);
    }

}
