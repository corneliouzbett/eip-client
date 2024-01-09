package com.ozonehis.eip;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.ozonehis.eip"})
public class Application {

    public static void main(final String[] args) {
        log.info("Starting EIP Client Application . . .");

        System.setProperty("spring.config.name", "@project.build.finalName@");

        SpringApplication.run(Application.class, args);
    }
}
