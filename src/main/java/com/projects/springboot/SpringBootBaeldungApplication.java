package com.projects.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.projects.springboot.repository")
@EntityScan("com.projects.springboot.entity")
@SpringBootApplication
public class SpringBootBaeldungApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBaeldungApplication.class, args);
	}

}
