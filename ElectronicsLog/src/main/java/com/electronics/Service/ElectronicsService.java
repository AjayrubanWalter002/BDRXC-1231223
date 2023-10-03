package com.electronics.Service;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.Entity.Electronics;
import com.electronics.Repository.ElectronicsRepo;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

@Service
public class ElectronicsService {

	Logger log = Logger.getLogger(Electronics.class);
	{
		PropertyConfigurator.configure("log4j.properties");
	}
	@Autowired
	ElectronicsRepo er;

	public String setProd(Electronics e) {
		if (e.getPrice() > 1500) {
			log.info("Successfull");
			er.save(e);
			return "Saved Successfully";
		} else {
			log.warn("UnSuccessfull");
			return "unsuccessfull";
		}
	}

	public String setAll(List<Electronics> j) {
		List<Electronics> g=j.stream().filter(l->l.getPrice()<1000).collect(Collectors.toList());
		if(g.isEmpty()) {
		log.info("Object Saved");
		er.saveAll(j);
		return "All objects Are Saved";
		}
		else {
			log.warn("price Exception");
			return "Did not Saved";
		}
	}
}


