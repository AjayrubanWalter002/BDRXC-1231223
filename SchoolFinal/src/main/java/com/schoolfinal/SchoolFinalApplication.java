package com.schoolfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SchoolFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolFinalApplication.class, args);
	}
	@Bean
	public RestTemplate getRest() {
		return new RestTemplate();
	}
}
