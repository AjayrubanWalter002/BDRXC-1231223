package com.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Primary

public class project1 {
	public void setName(String name) {
     System.out.println("ajairuban");
	}
}
