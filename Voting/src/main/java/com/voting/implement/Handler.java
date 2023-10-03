package com.voting.implement;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Handler {

	@ExceptionHandler(InvalidAge.class)

	public String ageHandler() {
		return "Age is Below 18 Couldn't Save the data";

	}

	@ExceptionHandler(NameException.class)
	public ResponseEntity<Object> nameHandler(NameException ne) {
		return new ResponseEntity<Object>(ne.getMessage (),HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(GenderException.class)
	public ResponseEntity<Object>  handle(){
		return new ResponseEntity<Object>("Enter the Valid gender",HttpStatus.BAD_REQUEST);
	}
}
