package com.details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.Entity.Address;
import com.details.Repository.AddressRepository;

@RestController
public class AdressControlle {
  @Autowired
  AddressRepository ar;
  @PostMapping("/setAddress")
  public String setAlls(@RequestBody List<Address> j) {
	  ar.saveAll(j);
	  return "Saved the Address"; 
  }
}
