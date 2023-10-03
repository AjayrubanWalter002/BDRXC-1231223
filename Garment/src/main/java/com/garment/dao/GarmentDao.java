package com.garment.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.garment.entity.Garment;
import com.garment.repository.GarmentRepository;

@Repository
public class GarmentDao {
@Autowired
GarmentRepository gr;
	public String setProduct(Garment m) {
		gr.save(m);
		return "Saved";
	}
}
