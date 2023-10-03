package com.temporal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.temporal.Entity.Details;

import com.temporal.Service.Services;

@RestController
public class Controllers {
	@Autowired
	Services ss;

	@PostMapping("/names")
	public String setDetails1(@RequestBody Details d) {
		return ss.setDetails1(d);
	}
}
