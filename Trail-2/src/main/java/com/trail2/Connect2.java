package com.trail2;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Connect2 {
	@Primary
	@GetMapping(value="/mobs")
	public Mobile  check(@RequestBody Mobile mobile) {
		return mobile;
	}
	@GetMapping(value="/mob")
	public Mobile checks(@RequestBody Mobile mob) {
		return mob;
	}
	@GetMapping(value="/mobss")
	public List<Mobile> mobi(@RequestBody List<Mobile> lis){
		return lis;
	}
	@GetMapping(value="/ram")
		public String price(@RequestBody String mobi) {
			if(mobi.equals("Samsunsg")){
				return "Good Phone";
			}
			else {
				return "Not Bad";
			}
		}
	
}
