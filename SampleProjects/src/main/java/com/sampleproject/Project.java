package com.sampleproject;

import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
//@Primary
public class Project {

	@GetMapping("/show")
	public String getName() {
		return "AJAY";
	}
}