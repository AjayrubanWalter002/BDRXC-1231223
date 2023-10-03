package com.uploadfiles;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MaximumSize {
@ExceptionHandler(UploadSizeException.class)
public ResponseEntity<Object> filess(){
	return new ResponseEntity<Object>("Please upload lessthan 2Mb file",HttpStatus.EXPECTATION_FAILED);
}
}
