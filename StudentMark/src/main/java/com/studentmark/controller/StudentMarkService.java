package com.studentmark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmark.entity.StudentMark;
@Service
public class StudentMarkService {
 @Autowired
 StudentMarkDao dao;
	public String setAllMarks(StudentMark s) {
      int k=s.getTamilMark()+s.getEnglishMark()+s.getMathsMark()+s.getScienceMark()+s.getSocialMark();
      s.setTotalMark(k);
		return  dao.setAllMarks(s);
	}
	public int getByRoll(int roll) {
		
		return dao.getByRoll(roll); 
	}

}
