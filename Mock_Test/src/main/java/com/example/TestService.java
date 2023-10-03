package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	TestRepository testRepository;
	@Autowired
	private TestDao testDao;

	public TestService(TestRepository repository) {
		// TODO Auto-generated constructor stub
	}

	public String setOne(TestEntity t) {
		
		return testDao.setOne(t);
	}

	public String saves(List<TestEntity> ob) {
		   
		return testDao.saves(ob);
	}

	public List<TestEntity> showAll() {
		return testDao.showAll();
	}	
}
