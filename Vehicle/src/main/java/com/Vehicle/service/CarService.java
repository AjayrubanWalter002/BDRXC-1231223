package com.Vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import com.Vehicle.doa.CarDoa;
import com.Vehicle.entity.Car;


@Service
public class CarService {
@Autowired
CarDoa cd;
public String setCar(Car c) {
	return cd.setCar(c);
}
public String setAll(List<Car> b) {
	return cd.setAll(b);
}
public Car gets(int a) {
	
	return cd.gets(a);
}
public List<Car> getAll() {
	return cd.getAll();
}
public String delete(int a) {
	
	return cd.delete(a);
}
public List<Car> getbyBrand(String name) {
	
	return cd.getbyBrand(name);
}
//@Autowired
//RestTemplate rt;
//public String getGst1() {
	//String url="http://localhost:/8081/";
	//ResponseEntity<List<Car>> r=rt.exchange(url, HttpMethod.GET,new ParameterizedTypeReference<List<Car>>(){} );
	//       r.getBody();
	   //    return r;
//}
}
