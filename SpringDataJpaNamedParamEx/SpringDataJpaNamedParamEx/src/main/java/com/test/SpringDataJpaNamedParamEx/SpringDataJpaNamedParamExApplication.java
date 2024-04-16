package com.test.SpringDataJpaNamedParamEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.test.SpringDataJpaNamedParamEx.*")
@EntityScan("com.test.SpringDataJpaNamedParamEx.entity")
public class SpringDataJpaNamedParamExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaNamedParamExApplication.class, args);
	}

}
