package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/main2")
    public ResponseEntity<String> showName(){
    	return new ResponseEntity<String>("Circuit Breaker Service 1",HttpStatus.ACCEPTED);
    }
}
