package com.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.dao.EngineDao;
import com.car.entity.Engine;

@Service
public class EngineService {
	@Autowired
	EngineDao ed;
	public String setEngine(Engine e) {
		return ed.setEngine(e);
	}
}
