package com.student.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
@GetMapping("/getthename")
public String getName() {
	return "Hi this is Rest Template in Student Controller";
}
@GetMapping("/getNumber")
public Integer getNumber() {
	return 2+2; 
}
@PostMapping("/setAll")
public String setAll(@RequestBody List<Student> s){
	return service.setAll(s);
}
@GetMapping("/getDetail")
public List<Student> getAllStudents(){
	return service.getAllStudents();
}

}
