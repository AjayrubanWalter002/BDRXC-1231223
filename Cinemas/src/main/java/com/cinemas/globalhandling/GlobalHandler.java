   package com.cinemas.globalhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cinemas.customexception.IdNotFound;
import com.cinemas.customexception.NameException;
import com.cinemas.customexception.YearException;

@RestControllerAdvice
public class GlobalHandler {
@ExceptionHandler(YearException.class)
public String yearHandler() {
	return "You entered the invalid data";
}
@ExceptionHandler(NameException.class)
public ResponseEntity<Object> actorName(){
	return new ResponseEntity<Object> ("Invalid",HttpStatus.BAD_REQUEST);
}
//@ExceptionHandler(IdNotFound.class)
// public String idNotFound() {
	//return "You Entered Invalid Id please enter valid id";
//}
@ExceptionHandler(IdNotFound.class)
	public ResponseEntity<Object> idnotfound(){
		return new ResponseEntity<Object>("Invalid"+ "",HttpStatus.BAD_REQUEST);
	}
}


