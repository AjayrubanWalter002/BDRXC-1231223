package com.studentmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentMarkApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMarkApplication.class, args);
	}
	@Bean
	public RestTemplate getrestTempleate() {
		return new RestTemplate();
	}
}
