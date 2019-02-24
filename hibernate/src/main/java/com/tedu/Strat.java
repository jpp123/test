package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tedu.repository")
@EntityScan(basePackages = "com.tedu")
public class Strat {
	public static void main(String[] args) {
		SpringApplication.run(Strat.class, args);
	}
}
