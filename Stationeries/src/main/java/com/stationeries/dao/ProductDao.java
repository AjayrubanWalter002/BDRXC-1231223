package com.stationeries.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stationeries.entity.Products;
import com.stationeries.repository.ProductRepository;

@Repository
public class ProductDao {
@Autowired
ProductRepository pr;
	public String setProducts(Products a) {
		pr.save(a);
		return "Saved Successfully";
	}
	public String setAll(List<Products> l) {
		pr.saveAll(l);
		return "Saved all Successfully";
	}
	public Products getbyId(int a) {
		return pr.findById(a).get();
	}
	public List<Products> getAll() {
		return pr.findAll();
	}
}
