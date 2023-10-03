package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	private TestRepository testRepository;
	public List<TestEntity> showAll() {
		
		return testRepository.findAll();
	}
	public String setOne(TestEntity t) {
		testRepository.save(t);
		return "Saved";
	}
	public String saves(List<TestEntity> ob) {
		 testRepository.saveAll(ob);
		return "Saved";
	}
 }
  

