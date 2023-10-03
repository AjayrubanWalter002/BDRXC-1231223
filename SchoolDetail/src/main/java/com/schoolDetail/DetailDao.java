package com.schoolDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class DetailDao {
@Autowired
DetailRepository repo;
	public String setAll(List<Details> s) {
		repo.saveAll(s);
		return "Saved All the Details";
	}
	public List<Details> getAll() {
		return repo.findAll();
	}
	

}
