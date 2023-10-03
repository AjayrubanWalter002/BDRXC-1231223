package com.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.entity.Engine;
import com.car.service.EngineService;

@RestController
public class EngineController {
 @Autowired
 EngineService es;
 @PostMapping("/setEngine")
 public String setEngine(@RequestBody Engine e) {
	 return es.setEngine(e);
 }
}
