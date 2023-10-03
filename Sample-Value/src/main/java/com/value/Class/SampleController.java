package com.value.Class;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
  
	@Value("${m: Hi! This is Ajay!}")
	String m;
	@GetMapping("/display")
	public String display() {
		return m;
	}
}
