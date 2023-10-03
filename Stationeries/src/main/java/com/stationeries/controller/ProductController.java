package com.stationeries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.stationeries.entity.Products;
import com.stationeries.service.ProductService;

@RestController
public class ProductController {
 @Autowired
 ProductService ps;
 @PostMapping("/setProduct")
	public String setProduct(@RequestBody Products a) {
		return ps.setProducts(a);
	}
 @PostMapping("/setAll")
 public String setAll(@RequestBody List<Products> p) {
	 return ps.setAll(p);
 }
@GetMapping("/gets/{a}")
 public Products getbyId(@PathVariable int a) {
	return ps.getbyId(a);
}
@GetMapping("/getAll")
	public List<Products> getAll(){
		return ps.getAll();
	}
@GetMapping("getbyName/{name}")
public List<Products> getbyName(@PathVariable String name) {
	return  ps.getbyName(name);
}
@GetMapping("/getMax")
public Products getMax(){
	return ps.getMax();
}
@GetMapping("/getMin")
public Products getMin() {
	return ps.getMin();
}
@GetMapping("/findRange")
public List<Products> findRange(){
	return ps.findRange();
}
@PutMapping("/update/{id}")
public String update(@PathVariable int id,@RequestBody Products p) {
	return ps.update(id,p);
}
}

