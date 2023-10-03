package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 @GetMapping("/show")
 public String get() {
	 return "Hello ";
 }
}
