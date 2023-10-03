package com.student.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;

	public String setAll(List<Student> s) {
		 return dao.setAll(s);
	}

	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

}
