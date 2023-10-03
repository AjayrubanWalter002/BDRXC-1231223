package com.schoolmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MarkService {
@Autowired
MarkDao dao;
	public String setAll(List<Mark> m) {
		for(Mark l:m) {
			int total=l.getTamilMark()+l.getEnglishMark()+l.getMathsMark()+l.getScienceMark()+l.getSocialMark();
			l.setTotalMark(total);
		}
		return dao.setAll(m) ;
	}
	public List<Mark> getAll() {
		return dao.getAll();
	}
	public int getbyRoll(int rollNo) {
		return  dao.getbyRoll(rollNo);
	}

}

//public String setAll(List<Products> p) {
//	 for(Products x:p) {
//	int y=x.getPrice()+x.getPrice()*x.getTax()/100;
//	x.setNePrice(y);
//}
//return pd.setAll(p);

