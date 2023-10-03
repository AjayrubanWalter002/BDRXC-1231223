package com.shirt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shirt.dao.ShirtDao;
import com.shirt.entity.Shirt;
import com.shirt.exceptio.PriceException;

@Service
public class ShirtService {
@Autowired
ShirtDao sd;
public String setShirt(Shirt m) throws PriceException{
	if(m.getPrice()<500) {
		throw new PriceException("Enter above 500");
	}
	else {
		return sd.setShirt(m);
	}
}
public String setAllShirt(List<Shirt> s) throws PriceException{
	List<Shirt> f=s.stream().filter(d->d.getPrice()>1000).collect(Collectors.toList());
	//List<Shirt> g=s.stream().filter(k->k.getPrice()>500).collect(Collectors.toList());
	if(f.isEmpty()) {
		throw new PriceException("price less than 1000");
	}
	else {
		return sd.setAllShirt(s);
		
	} 
}
public Shirt getbyId(int id) {
	return sd.getbyId(id);
}

}

