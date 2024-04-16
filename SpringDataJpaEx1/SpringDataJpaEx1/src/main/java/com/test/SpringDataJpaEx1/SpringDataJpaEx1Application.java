package com.test.SpringDataJpaEx1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.test.SpringDataJpaEx1.*")
@EntityScan("com.test.SpringDataJpaEx1.model")
public class SpringDataJpaEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaEx1Application.class, args);
	}

}
