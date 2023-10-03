 package com.stationeries.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stationeries.dao.ProductDao;
import com.stationeries.entity.Products;

@Service
 public class ProductService {
 @Autowired
 ProductDao pd;
	public String setProducts(Products p) {
		Products x=p;
		int y=x.getPrice()+x.getPrice()*x.getTax()/100;
		x.setNePrice(y);
		return pd.setProducts(x);
	}
	public String setAll(List<Products> p) {
		 for(Products x:p) {
		int y=x.getPrice()+x.getPrice()*x.getTax()/100;
		x.setNePrice(y);
		 }
		return pd.setAll(p);
		
	}
	public Products getbyId(int a) {
		
		return pd.getbyId(a);
	}
	public List<Products> getAll() {
		return pd.getAll();
	}
	public List<Products> getbyName(String name) {
		
		List<Products> x=getAll();
		List<Products> z=x.stream().filter(y->y.getName().equals(name)).collect(Collectors.toList());
		return z;
	}
	public Products getMax() {
		List<Products>x=getAll();
		return x.stream().sorted(Comparator.comparingInt(Products::getPrice).reversed()).findFirst().get();
			 
		 }
	public Products getMin() {
		List<Products> v=getAll(); 
		
		return v.stream().sorted(Comparator.comparingInt(Products::getPrice)).findFirst().get();
	}
	public List<Products> findRange() {
		List<Products> j=getAll();
		return j.stream().filter(g->g.getPrice()>=20&&g.getPrice()<=40).collect(Collectors.toList());
//this  is putmapping	 
	}
	public String update(int id, Products p) {
		 Products c=getbyId(id);
	     c.setName(p.getName());
		 c.setBrand(p.getBrand());
		 c.setPrice(p.getPrice());
		 c.setTax(p.getTax());
		 c.setNePrice(p.getNePrice());
		 c.setQuantity(p.getQuantity());
		 c.setHsn(p.getHsn());
		 c.setRating(p.getRating());
		 pd.setProducts(c);
		 return "Updated";
		 
	}
	
	}

