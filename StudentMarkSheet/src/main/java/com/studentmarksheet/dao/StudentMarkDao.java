package com.studentmarksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentmarksheet.entity.StudentMark;
import com.studentmarksheet.repository.StudentMarkRepository;

@Repository
public class StudentMarkDao {
@Autowired
StudentMarkRepository smr;
	public String setMarks(StudentMark s) {
		smr.save(s);
		return "Saved Successfully";
	}
	public String setAllMarks(List<StudentMark> m) {
		smr.saveAll(m);
		return "Saved Successfully";
	}
	public List<StudentMark> getAllMarks() {
		return smr.findAll();
	}
}
