package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	TestService testService;
  
	@PostMapping("/saveOne")
	public String setOne(@RequestBody TestEntity t) {
		return testService.setOne(t);
	}

	@PostMapping("/saves")
	public String saves(@RequestBody List<TestEntity> ob) {
		return testService.saves(ob);
	}

	@GetMapping("/showAll")
	public List<TestEntity> showAll() {
		return testService.showAll();
	}
}
