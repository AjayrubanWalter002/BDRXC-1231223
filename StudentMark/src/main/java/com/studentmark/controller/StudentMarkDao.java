package com.studentmark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentmark.entity.StudentMark;

@Repository
public class StudentMarkDao {
@Autowired
StudentMarkRepository repo;
	public String setAllMarks(StudentMark s) {
		repo.save(s);
		return "Saved All the Marks";
	}
	public int getByRoll(int roll) {
		
		return repo.getByRoll(roll);
	}

}
