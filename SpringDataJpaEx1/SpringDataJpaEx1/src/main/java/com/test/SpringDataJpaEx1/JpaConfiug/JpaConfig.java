package com.test.SpringDataJpaEx1.JpaConfiug;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.test.SpringDataJpaEx1.*")
@Configuration
public class JpaConfig {
}
