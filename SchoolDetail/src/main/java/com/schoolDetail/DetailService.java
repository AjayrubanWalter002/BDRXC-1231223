package com.schoolDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {
@Autowired
DetailDao dao;
	public String setAll(List<Details> s) {
		return dao.setAll(s);
	}
	public List<Details> getAll() {
		return dao.getAll();
	}

}
