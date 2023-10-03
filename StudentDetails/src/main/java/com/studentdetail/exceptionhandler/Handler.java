package com.studentdetail.exceptionhandler;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.studentdetail.exception.AgeException;

@RestControllerAdvice
public class Handler {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> age(){
		return new ResponseEntity<Object>("Invalid",HttpStatus.BAD_REQUEST);
	}

}
