package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
   
	@GetMapping("/main3")
	public ResponseEntity<String> getNames3(){
		return new ResponseEntity<String>("CircuitBreaker 3",HttpStatus.ACCEPTED);
	}
}
