package com.garment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garment.dao.GarmentDao;
import com.garment.entity.Garment;

@Service
public class GarmentService {
@Autowired
GarmentDao gd;
	public String setProduct(Garment g) {
		return gd.setProduct(g);
	}
}
