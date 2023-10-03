package com.schoolmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkController {
 @Autowired
 MarkService service;
 @PostMapping("setAllMark")
 public String setAll(@RequestBody List<Mark> m) {
	 return service.setAll(m);
 }
 @GetMapping("/getAllMarks")
 public List<Mark> getAll(){
	 return service.getAll();
 }
 @GetMapping("/getbyRollNo/{rollNo}")
 public int getbyRoll(@PathVariable int rollNo) {
	 return service.getbyRoll(rollNo);
 }
}
