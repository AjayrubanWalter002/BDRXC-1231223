package com.log4j_project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Loggerprogram {
  static Logger log=Logger.getLogger(Loggerprogram.class);
public static void main(String[] args) {
	PropertyConfigurator.configure("log4j");
	 log.info("Information");
	 log.warn("Warning");
	 log.error("Error");
	 log.fatal("Critical Error");
}
}
	
