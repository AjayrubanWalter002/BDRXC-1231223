package com.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.entity.SalesProduct;
import com.sales.service.SalesProductService;

@RestController
public class SalesProductController {
	@Autowired
	SalesProductService sps;

	@PostMapping("/setSalesProduct")
	public String setSalesProduct() {
		return sps.setSalesProduct();
	}
	@GetMapping("getAllObjects")
	public ResponseEntity<List<SalesProduct>> getallobject(){
		return sps.getallObject();
	}

}
