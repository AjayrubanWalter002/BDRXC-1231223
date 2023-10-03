package com.studentmarksheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.studentmarksheet.entity.StudentMark;
import com.studentmarksheet.service.StudentMarkService;

@RestController
public class StudentMarkController {
@Autowired
StudentMarkService sms;
@PostMapping("/setMarks")
public String setMarks(@RequestBody StudentMark s) {
	return sms.setMarks(s);
}
	@PostMapping("/setAllMarks")
	public String setAllMarks(@RequestBody List<StudentMark> m) {
		return sms.setAllMarks(m);
	}
	@GetMapping("/getAllMark")
public List<StudentMark> getAllMark(){
	return sms.getAllMarks();
	}	
}
