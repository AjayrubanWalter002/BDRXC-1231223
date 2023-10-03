package com.shirt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shirt.entity.Shirt;
import com.shirt.exceptio.PriceException;
import com.shirt.service.ShirtService;

@Controller
//@RequestMapping("/B")
public class ShirtController {
@Autowired
ShirtService ss;
@PostMapping("/setShirts")
public String setShirt(@RequestBody Shirt s) throws PriceException{
	return ss.setShirt(s);
}
@PostMapping("/setAllShirt")
	public String setAllShirt(@RequestBody List<Shirt> s) throws PriceException{
		return ss.setAllShirt(s);
	}
@GetMapping("/gettingById/{id}")
public Shirt getbyId(@PathVariable int id) {
	return ss.getbyId(id); 
}
}

