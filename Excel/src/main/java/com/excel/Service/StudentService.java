package com.excel.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import com.excel.Entity.*;
import com.excel.Repository.StudentRepository;

import java.util.*;
@Service
public class StudentService {
//implements com.excel.Services.StudentService{
  @Autowired
  StudentRepository sr;
  public String setAll(List<Student> s) {
	    sr.saveAll(s);
	    return "Saved Succesfully";
  }
  public List<Student> getAll() {
		
		return sr.findAll();
	}
//  public void addStudent(Student student) {
//      sr.save(student);
//  }
//  public List < Student > getTheListStudent() {
//      return sr.findAll();
//  }
  //get Excel method;
//public List<Student> getExcel() {
//	
//	return  sr.findAll();
//}

}
