package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping(value = "/get")
	public String getHi() {
		return "Hello World!";
	}

	@GetMapping("/gets/{a}/{b}")
	public String add(@PathVariable int a, @PathVariable int b) {
		return "Addition is " + (a + b);
	}

	@GetMapping("/getName/{name1}/{name2}")
	public String getNames(@PathVariable String name1, @PathVariable String name2) {
		return "Welcome Mr." + name1.concat(name2);
	}

	@GetMapping("/isPrime/{num}")
	public String isPrice(@PathVariable int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			return "Prime";
		} else {
			return "Not a Prime";
		}
	}

	@Value("${name}")
	private String name;

	@GetMapping("/getValue")
	public String getVal() {
		return name;
	}
}
