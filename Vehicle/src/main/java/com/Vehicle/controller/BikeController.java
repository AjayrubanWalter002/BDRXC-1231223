package com.Vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.entity.Bike;
import com.Vehicle.exception.PriceException;
import com.Vehicle.service.BikeService;

@RestController
//@Controller
//@ResponseBody
//@Primary
//@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/A")
public class BikeController {
	@Autowired
	BikeService bs;

	@PostMapping("/setBike")
	public String setBike(@RequestBody Bike a) throws PriceException {
		return bs.setBike(a);
	}

	@PostMapping("/setAll")
	public String setAll(@RequestBody List<Bike> c) throws PriceException {
		return bs.setAll(c);
	}

	@GetMapping("/getAll")
	public List<Bike> getAll() {
		return bs.getAll();
	}

	@DeleteMapping("/delt/{a}")
	public String del(@PathVariable int a) {
		return bs.del(a);
	}

	@GetMapping("/gets/{s}")
	public Bike gets(@PathVariable int s) {
		return bs.gets(s);
	}

	@GetMapping("/getsAll/")
	public List<Bike> getsAll1() {
		return bs.getsAll();
	}

	@GetMapping("/getsByBrand/{name}")
	public List<Bike> getbyBrand(@PathVariable String name) throws Exception {
		return bs.getbyBrand(name);
	}

	@GetMapping("/getByPrice/{a}")
	public List<Bike> getbyprice(@PathVariable int a) {
		return bs.getbyPrice(a);
	}

	@GetMapping("gettingModel/{g}")
	public List<Bike> getsbyModel(@PathVariable String g) {
		return bs.getsbyModel(g);
	}

	@GetMapping("/priceRange/{num1}/{num2}")
	public List<Bike> getpriceRange(@PathVariable int num1, @PathVariable int num2) {
		return bs.getpriceRange(num1, num2);
	}

	@GetMapping("/maximumPrice")
	public List<Bike> findmaxPrice() {
		return bs.findMaxprice();
	}

	@GetMapping("/orderByMaxi")
	public List<Bike> orderByMax() {
		return bs.orderByMax();
	}

	@GetMapping("/selectBrand")
	public List<String> selectBrand() {
		return bs.selectBrand();
	}

	@GetMapping("/selectPrice")
	public List<Integer> selectPrice() {
		return bs.selectPrice();
	}

	@GetMapping("/priceBrand")
	public List<String> priceBrand() {
		return bs.priceBrand();
	}
}
