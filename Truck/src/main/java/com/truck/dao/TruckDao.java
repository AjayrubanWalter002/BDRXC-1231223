package com.truck.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.truck.entity.Truck;
import com.truck.repository.TruckRepository;

@Repository
public class TruckDao {
	@Autowired
	TruckRepository tr;
 public String setName(Truck t) {
	 tr.save(t);
	 return "Saved";
 }
public String setAllTruck(List<Truck> k) {
	   tr.saveAll(null);
	   return "Saved All Successfully";
}

}
