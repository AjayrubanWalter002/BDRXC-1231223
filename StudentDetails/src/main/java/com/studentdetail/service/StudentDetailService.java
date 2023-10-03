package com.studentdetail.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.studentdetail.dao.StudentDetailDao;
import com.studentdetail.entity.Student;
import com.studentdetail.exception.AgeException;

@Controller
public class StudentDetailService {
@Autowired
StudentDetailDao sdd;
	public String setStudent(Student st) throws AgeException{
		if(st.getAge()<18) {
			throw new AgeException();
		}
		else {
			return sdd.setStudent(st);
		}
	}
	public String setAll(List<Student> s) throws AgeException{
		List<Student> y=s.stream().filter(g->g.getAge()<18).collect(Collectors.toList());
			if(y.isEmpty()) {
				return sdd.setAll(s);
			
			}
			else {
				throw new AgeException();
			}
	}
	public List<Student> getAll() {
		return sdd.getAll();
	}
	public Student getbyId(int id) {
		return sdd.getbyId(id);
	}
	public String deltbyId(int id) {
		
		return sdd.deltbyId(id);
	}
	public String deleteAll() {
		return sdd.deleteAll();
	}
	
	public String updates(int id,int age) {
		return sdd.updates(id,age);
	}
}
