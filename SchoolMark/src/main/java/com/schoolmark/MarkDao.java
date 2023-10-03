package com.schoolmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MarkDao {
@Autowired
MarkRepository repo;
	public String setAll(List<Mark> m) {
		repo.saveAll(m);
		return "Saved the Marks";
	}
	public List<Mark> getAll() {
		return repo.findAll();
	}
	public int getbyRoll(int rollNo) {
		return repo.getbyRoll(rollNo);
	}
	

}
