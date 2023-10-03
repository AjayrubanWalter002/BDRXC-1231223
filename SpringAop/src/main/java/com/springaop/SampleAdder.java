package com.springaop;

import org.apache.logging.log4j.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
public class SampleAdder {
	Logger log=Logger.getLogger(SampleAdder.class){
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
 public int adder(int a,int b) {
	 return a+b;
	 
 }
}
