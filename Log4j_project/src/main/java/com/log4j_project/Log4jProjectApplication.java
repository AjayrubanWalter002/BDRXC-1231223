package com.log4j_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
@SpringBootApplication
public class Log4jProjectApplication {
static Logger log= Logger.getLogger(Log4jProjectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Log4jProjectApplication.class, args);
		BasicConfigurator.configure();
		log.info("Information");
		log.warn("Warning");
	    log.error("Error");
	    log.fatal("Critical Error");
	}

}
