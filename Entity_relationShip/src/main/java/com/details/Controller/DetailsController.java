package com.details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.Entity.Details;
import com.details.Repository.DetailsRepository;

@RestController
public class DetailsController {
   @Autowired
   DetailsRepository dr;
   @PostMapping("/setAll")
   public String setAll(@RequestBody List<Details> f) {
	   dr.saveAll(f);
	   return "Saved the Details";
   }
}
