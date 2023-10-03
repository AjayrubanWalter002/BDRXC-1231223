package com.sampleproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@Primary
public class Name  {
@GetMapping("/show")
public String showMyName() {
	return "AJAYRuban ";
}
} 