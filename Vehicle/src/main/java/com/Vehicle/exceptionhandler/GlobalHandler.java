package com.Vehicle.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Vehicle.exception.PriceException;

@RestControllerAdvice
public class GlobalHandler {
@ExceptionHandler(PriceException.class)
	public String priceException() {
		return "sorryy... you entered an invalid data please enter the valid data "
				+ "Thank you....";
	}
}

