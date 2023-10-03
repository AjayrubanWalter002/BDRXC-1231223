package com.truck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.dao.TruckDao;
import com.truck.entity.Truck;
@Service
public class TruckService {
@Autowired
TruckDao td;
	public String setName(Truck t) {
		Truck g=t;
		int y=g.getPrice()+g.getPrice()*g.getTax()/100;
		g.setNetPrice(y);
		return td.setName(t);
	}
	public String setAllTruck(List<Truck> k) {
	return td.setAllTruck(k);
		
	}
	
}
