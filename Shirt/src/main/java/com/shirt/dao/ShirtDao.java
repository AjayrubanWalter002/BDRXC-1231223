package com.shirt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shirt.entity.Shirt;
import com.shirt.repository.ShirtRepository;

@Repository
public class ShirtDao {
@Autowired
ShirtRepository sr;
public String setShirt(Shirt m) {
	sr.save(m);
	return "Saved successfully";
}
public String setAllShirt(List<Shirt> s) {
	sr.saveAll(s);
	return "Saved all Successfully";
}
public Shirt getbyId(int id) {
	return sr.findById(id).get();
}
}
