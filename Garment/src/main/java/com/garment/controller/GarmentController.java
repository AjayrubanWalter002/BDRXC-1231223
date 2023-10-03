package com.garment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.garment.entity.Garment;
import com.garment.service.GarmentService;

@Controller
public class GarmentController {
@Autowired
GarmentService gs;
@PostMapping("/setProduct")
	public String setproduct(Garment g) {
		return gs.setProduct(g);
	}
}
