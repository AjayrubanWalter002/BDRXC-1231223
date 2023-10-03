package com.electronics.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.electronics.Service.*;

import com.electronics.Entity.*;
import java.util.*;
@RestController
public class ElectronicsController {

	@Autowired
	ElectronicsService es;

	@PostMapping("/setproducts")
	public String setProd(@RequestBody Electronics e) {
		return es.setProd(e);
	}
	@PostMapping("/setAllproducts")
	public String setAll(@RequestBody List<Electronics> l) {
		return es.setAll(l);
	}
}

