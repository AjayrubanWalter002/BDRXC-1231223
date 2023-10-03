package com.Vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.entity.Car;
import com.Vehicle.service.CarService;

@RestController
//@Primary
@RequestMapping("/B")
public class CarController {
	@Autowired
	CarService cs;
  @PostMapping("/setCar")
  public String setCar(@RequestBody Car c) {
	  return cs.setCar(c);
  }
  @PostMapping("/setAllcar")
  public String setAll(@RequestBody List<Car> b){
	  return cs.setAll(b);
  }
  @GetMapping("/getCar/{a}")
  public Car gets(@PathVariable int a) {
	  return cs.gets(a);
  }
  @Primary
  @GetMapping("/getAll")
  public List<Car> getAll(){
	  return cs.getAll(); 
  }
  @DeleteMapping("/delt/{a}")
  public String del(@PathVariable int a) {
	  return cs.delete(a);
  }
  @GetMapping("/getName/{name}")
  public List<Car> getbyBRand(@PathVariable String name){
	  return cs.getbyBrand(name);
  }
  //@CrossOrigin
  //@GetMapping
  //public String getGst1() {
	 //  return cs.getGst11(){
 // }
  
}
