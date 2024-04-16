package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.test.entity")
@ComponentScan(basePackages = "com.test.*")
public class SpringDataJpaGreaterThanEqualApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaGreaterThanEqualApplication.class, args);
    }

}
