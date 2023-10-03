package com.studentmark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.studentmark.entity.StudentMark;

@RestController
public class MarkController {
 @Autowired
 RestTemplate rt;
 @Autowired
 StudentMarkService service;
	
	@GetMapping("/names")
	public String getName() {
		String url1="http://localhost:8080/getthename";
		ResponseEntity<String> res=rt.exchange(url1,HttpMethod.GET,null,String.class);
		 String val=res.getBody();
		 return val.toUpperCase();
	}
	@GetMapping("/number")
	public Integer getNumber() {
		String url2="http://localhost:8080/getNumber";
		ResponseEntity<Integer> num=rt.exchange(url2, HttpMethod.GET,null,Integer.class);
		Integer vals=num.getBody();
		return vals*vals;
	}
	@PostMapping("/setAllMarks")
    public String setAllMarks(@RequestBody StudentMark s) {
		return service.setAllMarks(s);
	}
	
	@GetMapping("/getByrollNo/{roll}")
	public int getByRollNo(@PathVariable int roll) {
		return service.getByRoll(roll);
	}
	
	
}
