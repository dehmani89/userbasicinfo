package com.dehmani.userbasicinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UserbasicinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserbasicinfoApplication.class, args);
    }

}
