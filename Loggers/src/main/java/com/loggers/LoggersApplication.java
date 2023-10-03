package com.loggers;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class LoggersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggersApplication.class, args);
	} 
	

}
