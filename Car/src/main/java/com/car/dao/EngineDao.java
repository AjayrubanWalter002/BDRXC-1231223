package com.car.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.entity.Engine;
import com.car.repository.EngineRepository;

@Repository
public class EngineDao {
@Autowired
EngineRepository er;
public String setEngine(Engine e) {
	 er.save(e);
	 return "Saved";
}
}
