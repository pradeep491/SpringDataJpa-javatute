package com.test.SpringDataJpaNamedParamEx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.test.SpringDataJpaNamedParamEx.repo")
public class JpaConfig {
}
