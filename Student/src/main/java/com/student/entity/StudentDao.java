package com.student.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
  @Autowired
  StudentRepository repo;

public String setAll(List<Student> s) {
	 repo.saveAll(s);
	 return "Saved All";
}

public List<Student> getAllStudents() {
	return repo.findAll();
}
}
