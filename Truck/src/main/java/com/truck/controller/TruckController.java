package com.truck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.truck.entity.Truck;
import com.truck.service.TruckService;

@RestController
public class TruckController {
@Autowired
TruckService ts;
@GetMapping("/setTruck")
public String setName(@RequestBody Truck t) {
	return ts.setName(t);
}
@PostMapping("/setAllTruck")
public String setAllTruck(@RequestBody List<Truck> k) {
	return ts.setAllTruck(k);
}

}
