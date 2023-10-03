package com.profiles.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;

@RestController
public class ProfileController {
	@Value("${message}")
	String m;

	@GetMapping("/show")
	public String gets() {
		return "Hi!" + m;
	} 	

}
