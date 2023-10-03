
package com.Vehicle.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Vehicle.entity.Bike;
import com.Vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
public String setBike(Bike b) {
	 br.save(b);
	 return "Saved Succesfully";
}
public String setAll(List<Bike> c) {
	br.saveAll(c);
	return "Saved all Successfully";
}
 public List<Bike> getAll(){
	 return br.findAll();
 }
public String del(int a) {
	 br.deleteById(a);
	 return "deleted successfully";
}
public Bike gets(int s) {
	
	return br.findById(s).get();
}
public List<Bike> getsAll() {
	return br.findAll();
}
public List<Bike> getbyBrand(String name) {
	
	return br.getbyBrand(name);
}
public List<Bike> getbyPrice(int a) {
	return br.getbyprice(a);
}
public List<Bike> getsbyModel(String g) {
	
	return br.getsbyModel(g) ;
}
public List<Bike> getPriceRange(int num1, int num2) {
	return br.getpriceRange(num1,num2);
}
public List<Bike> findmaxPrice() {
	return br.findmaxPrice();
}
public List<Bike> orderByMax() {
	
	return br.orderByMax();
}
public List<String> selectBrand() {
	return br.selectBrand();
}
public List<Integer> selectPrice() {
	return br.selectPrice();
}
public List<String> priceBrand() {
	
	return br.priceBrand();
}
}


