 package com.logg.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import lombok.extern.java.Log;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
@RestController
public class Controllers {
	
 Logger log=Logger.getLogger(Controllers.class);
 {
	 PropertyConfigurator.configure("log4j.properties");
 }
 @Autowired
 LogService ls;
	@GetMapping("/getNames")
  public String getName() {
	
		log.info("Information");
		log.warn("Warning");
		log.debug("Debugging");
		log.error("Error Occurs");
		//log.fatal("Critical Error");
     return "Hi"; 
		
     
		}
	@PostMapping("/setDetails")
	public String setDetail(@RequestBody LogEntity l) throws IOException{
		log.info("Creating");
		return ls.setDetail(l);
	}
}



//@PostMapping("/create")
//public void create(@Valid @RequestBody Student student) {
// logger.info("Creating a Student");
// service.createStudent(student);
