package com.studentmarksheet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmarksheet.dao.StudentMarkDao;
import com.studentmarksheet.entity.StudentMark;

@Service
public class StudentMarkService {
@Autowired
StudentMarkDao smd;
	public String setMarks(StudentMark m) {
		int s4=m.getSem1Theory()+m.getSem1Practicals();
		int s5=m.getSem2Theory()+m.getSem2Practicals();
		m.setSem1Total(s4);
		m.setSem2Total(s5);
		return smd.setMarks(m);
	}
	public String setAllMarks(List<StudentMark> m) {
	   for(StudentMark d:m) {
		   int s1=d.getSem1Theory()+d.getSem1Practicals();
		   int s2=d.getSem2Theory()+d.getSem2Practicals();
		    d.setSem1Total(s1);
		    d.setSem2Total(s2);
	   }
		return smd.setAllMarks(m);
	}
	public List<StudentMark> getAllMarks() {
		
		return smd.getAllMarks();
	}
}
