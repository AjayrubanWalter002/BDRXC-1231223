package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	CircuitBreakerService1 cbs1; 
	
   @GetMapping("/main")
   public ResponseEntity<String> getName(){
	   
	 String name=  cbs1.callCb1();
	   return new ResponseEntity<String>(name,HttpStatus.ACCEPTED);
   }
}
 