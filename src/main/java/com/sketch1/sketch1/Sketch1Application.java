package com.sketch1.sketch1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@Slf4j
public class Sketch1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sketch1Application.class, args);
    }

}
