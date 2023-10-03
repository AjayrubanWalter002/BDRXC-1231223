package com.car.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.entity.Car;
import com.car.repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository cr;
	public String setCar(Car c) {
		cr.save(c);
		return "Saved";
	}

}
