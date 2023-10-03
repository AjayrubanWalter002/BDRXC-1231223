package com.Vehicle.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Vehicle.entity.Car;
import com.Vehicle.repository.Carrepository;

@Repository
public class CarDoa {
@Autowired
Carrepository cr;
public String setCar(Car c) {
	cr.save(c);
	return "Saved Succesfully";
}
public String setAll(List<Car> b) {
	   cr.saveAll(b);
	return "Saved Successfully";
}
public Car gets(int a) {
	  return cr.findById(a).get();

}
public List<Car> getAll() {
	return cr.findAll();
}
public String delete(int a) {
	cr.deleteById(a);
	return "Deleted";

}
public List<Car> getbyBrand(String name) {
	return cr.getbyBrand(name);
}

}

