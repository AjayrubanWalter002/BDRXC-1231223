package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository
public class TimeController {

	
	@Autowired
	TimeRepository tr;
	
	@PostMapping("/setPerson")
	public ResponseEntity<String> setPerson(@RequestBody Person p){
		tr.save(p);
		return new ResponseEntity<String>("Saved",HttpStatus.OK);
	}
}
