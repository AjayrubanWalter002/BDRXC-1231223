package com.studentdetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.studentdetail.entity.Student;
import com.studentdetail.exception.AgeException;
import com.studentdetail.service.StudentDetailService;

@RestController
public class StudentDetailController {
	@Autowired
	StudentDetailService sds;
	@PostMapping("setDetails")
public String setStudent(@RequestBody Student s) throws AgeException{
	return sds.setStudent(s);
	}
	@PostMapping("/setAllStudent")
	public String setAll(@RequestBody List<Student> s) throws AgeException{
		return sds.setAll(s);
	}
	@GetMapping("/getById/{id}")
	public Student getbyId(@PathVariable int id) {
		return sds.getbyId(id);
	}
	@GetMapping("/getDetail")
	public List<Student> getDetails(){
		return sds.getAll();
	}
	@DeleteMapping("/delbyId/{id}")
		public String deltbyId(@PathVariable int id) {
		return sds.deltbyId(id);
	}
	@DeleteMapping("/delAll")
	public String deleteAll() {
		return sds.deleteAll();
	}
	@PutMapping("/update/{id}/{age}")
	public String updates(@PathVariable int id,@PathVariable int age) {
		return sds.updates(id,age);
	}
}

