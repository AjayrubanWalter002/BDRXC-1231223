package com.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.entity.Car;
import com.car.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService cs;

	@PostMapping("/SetCars") 
	public String setCar(@RequestBody Car c) {
		return cs.setCar(c);
	}
}
