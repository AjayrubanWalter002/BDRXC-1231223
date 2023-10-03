package com.studentdetail.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.service.annotation.DeleteExchange;

import com.studentdetail.entity.Student;
import com.studentdetail.repository.StudentDetailRepository;
@Repository
public class StudentDetailDao {
@Autowired
StudentDetailRepository sdr;
	public String setStudent(Student st) {
	sdr.save(st);
	return "Saved Successfully";
	}
	public String setAll(List<Student> s) {
		sdr.saveAll(s);
		return "Saved All Succesfully";
	}
	public List<Student> getAll() {
		return sdr.findAll();
	}
	public Student getbyId(int id) {
		return sdr.findById(id).get();
	}
	public String deltbyId(int id) {
		sdr.deleteById(id);
		return "Deleted Successfully";
	}
	public String deleteAll() {
	   sdr.deleteAll();
	   return "Deleted all Successfully";
	}
	public String updates(int id,int age) {
		List<Student> f=getAll();
		for(Student s:f) {
			int d=s.getId();
			if(d==id) {
			s.setAge(age);
		    sdr.save(s);
		}
		}
		return "Updated";
	}
}
