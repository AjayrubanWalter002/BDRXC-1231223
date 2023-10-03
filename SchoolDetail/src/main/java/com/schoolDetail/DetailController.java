package com.schoolDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
	@Autowired
	DetailService service;
	@PostMapping("/setAll")
	public String setAll(@RequestBody List<Details> s) {
		return service.setAll(s);
	}
	@GetMapping("/getAll")
	public List<Details> getAll(){
		return service.getAll();
	}

}
