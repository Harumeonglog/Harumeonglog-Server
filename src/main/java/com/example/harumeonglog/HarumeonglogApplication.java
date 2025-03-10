package com.example.harumeonglog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HarumeonglogApplication {

    public static void main(String[] args) {
        SpringApplication.run(HarumeonglogApplication.class, args);
    }

}
