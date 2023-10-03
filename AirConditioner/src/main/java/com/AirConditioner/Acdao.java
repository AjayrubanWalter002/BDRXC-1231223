package com.AirConditioner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Acdao {
     @Autowired
     AcRepository ar;
	public String setAc( Ac a) {
		ar.save(a);
		return "Save";
	}
	public String setallAc(List<Ac> b){
		ar.saveAll(b);
		return "Saved Succesfully";
	}
	public List<Ac> getallAc() {
		return ar.findAll();
	}
	public Ac getsAc(int c) {
		return ar.findById(c).get();
	}
	public String deltAc(int d) {
				ar.deleteById(d);
				return "Deleted";
	}
	
	}
