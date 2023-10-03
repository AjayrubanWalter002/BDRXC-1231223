package com.Vehicle.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vehicle.doa.BikeDao;
import com.Vehicle.entity.Bike;
import com.Vehicle.exception.PriceException;

@Service
public class BikeService {
	@Autowired
	BikeDao bd;
public String setBike(Bike b) throws PriceException{
	if(b.getPrice()<=100000) {
		throw new PriceException();
	}
	else {
		return bd.setBike(b);
	}
}
public String setAll(List<Bike> c) throws PriceException{
	List<Bike> i=c.stream().filter(j->j.getPrice()>200000).collect(Collectors.toList());
	if(i.isEmpty()) {
		throw new PriceException();
	}
	else {
		return bd.setAll(c);
	}
	

}
public List<Bike> getAll() {
	return bd.getAll();
}
public String del(int a) {
	
	return bd.del(a);
}
public Bike gets(int s) {
	
	return bd.gets(s);
}
public List<Bike> getsAll() {
	return bd.getsAll();
}
public List<Bike> getbyBrand(String name) throws Exception{
	List<Bike> y=getAll();
	List<Bike> v=y.stream().filter(i->i.getBrand().equalsIgnoreCase(name)).collect(Collectors.toList());
	if(v.isEmpty()) {
		throw new PriceException();	
	}
	else {
		return v;
	}
	

}
public List<Bike> getbyPrice(int a) {
	return bd.getbyPrice(a);
}
public List<Bike> getsbyModel(String g) {
	
	return bd.getsbyModel(g);
}
public List<Bike> getpriceRange(int num1, int num2) {
	return bd.getPriceRange(num1,num2);
}
public List<Bike> findMaxprice() {
	
	return bd.findmaxPrice();
}
public List<Bike> orderByMax() {
	return bd.orderByMax();
}
public List<String> selectBrand() {
	
	return bd.selectBrand();
}
public List<Integer> selectPrice() {
	
	return bd.selectPrice();
}
public List<String> priceBrand() {
	return bd.priceBrand();
}

}

