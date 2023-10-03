package com.samples2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
	@Autowired
	DetailsRepo dr;

	@GetMapping("/names")
	public ResponseEntity<String> getNames() {
		return new ResponseEntity<String>("Ajai ruban", HttpStatus.OK);
	}

	@GetMapping("/names2")
	public String getNames2() {
		return "Ajai ruban name 2";
	}

	@PostMapping("/setDetails")
	public ResponseEntity<String> setDetails(@RequestBody Details d) {
		dr.saveAll(d);
		return new ResponseEntity<String>("Saved", HttpStatus.ACCEPTED);

	}
}
