package com.logg;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;

@SpringBootApplication
public class LoggApplication {
//	 public static Logger log=ch.qos.logback.classic.Logger.getLogger(LoggApplication.class);
//	Logger logger= Logger.getLogger(LoggApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoggApplication.class, args);
//		PropertyConfigurator.configure(log4j.properties);
	}
       
}