package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@Enable
public class SpringServiceDiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringServiceDiscoveryApplication.class, args);
	}

}
