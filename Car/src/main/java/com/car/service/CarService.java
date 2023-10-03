package com.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.dao.CarDao;
import com.car.entity.Car;

@Service
public class CarService {
 @Autowired
 CarDao cd;
 public String setCar(Car c) {
	  return cd.setCar(c);
 }
}
