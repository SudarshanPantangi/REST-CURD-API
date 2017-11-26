package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.demo.repository")
@SpringBootApplication
public class Postgres12Application {

	public static void main(String[] args) {
		SpringApplication.run(Postgres12Application.class, args);
	}
}
