package com.AirConditioner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcController {
 @Autowired
 AcService as;
 @PostMapping("/setAc")
 public String setAc(@RequestBody Ac a) {
	 return as.setAc(a);
 }
 @PostMapping("/setallAc")
 public String setallAc(@RequestBody List<Ac> b){
	 return as.setallAc(b);
 }
 @GetMapping("/getAllAc")
 public List<Ac> getallAc(){
	 return as.getallAc();
 }
 @GetMapping("/getingAc/{c}")
 public Ac getsAc(@PathVariable int c) {
	 return as.getsAc(c);
 }
 @DeleteMapping("/delete/{d}")
public String delt(@PathVariable int d)	{
	 return as.deltAc(d);
}
 //@PatchMapping("updateName/{id}")
 //public String updateName(@PathVariable int id,@PathVariable String n) {
//	 return as.updateName(id,n);
 //}
@PutMapping("/changeBrand/{id}")
	public String changeName(@PathVariable int id,@RequestBody Ac n) {
		return as.changeName(id,n);
	}
@GetMapping("/show")
public String showName() {
	return "AJAI RUBAN";
}
}

