package com.AirConditioner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcService {
 @Autowired
 Acdao ad;
	
	public String setAc(Ac a) {
		Ac x=a;
		int y=(x.getPrice()-x.getPrice()*x.getTax()/100);
		x.setNetPrice(y);
		
		return ad.setAc(a);
	}
	
	public String setallAc(List<Ac> b){
		return ad.setallAc(b);
	}
	
	public List<Ac> getallAc() {
		return ad.getallAc();
	}
	
	public Ac getsAc(int c) {
		return ad.getsAc(c);
	}
	
	public String deltAc(int d) {
		
		return ad.deltAc(d);
	}
	
	public String updateName(int id,String n) {
		Ac a=getsAc(id);
		a.setBrand(n);
		return "Updated";
	}
	
	public String changeName(int id, Ac n) {
		Ac s=getsAc(id);
		s.setBrand(n.getBrand());
		s.setPrice(n.getPrice());
		ad.setAc(s);
		return "updated";
	}
	
}
