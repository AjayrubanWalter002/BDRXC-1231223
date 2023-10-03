package com.logg.Classes;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
@Autowired
LogRepository lr;
	public String setDetail(LogEntity l) throws IOException {
		if(l.getAge()>=25) {
			lr.save(l);
			return "saved Sucessfully";
		} 
		else {
			throw new IOException();	
		}
	}

}
