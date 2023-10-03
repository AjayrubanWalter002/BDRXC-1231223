package com.Swagger.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.Swagger.SwagConfig.IdException;
@RestControllerAdvice
public class IdNotFoundException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@ExceptionHandler(IdException.class)
public ResponseEntity<Object> idexception(){
	return new ResponseEntity<Object>("The Given Id is Not Matching",HttpStatus.BAD_REQUEST);
}
}
