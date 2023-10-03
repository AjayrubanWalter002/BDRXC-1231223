 package com.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sales.dao.SalesProductDao;
import com.sales.entity.SalesProduct;

@Service
public class SalesProductService {
	@Autowired
	RestTemplate rt;   
	@Autowired
	SalesProductDao spd;
	public String setSalesProduct() {
		String url1="http://localhost:8080/getAll";
		String url2="http://localhost:8081/getDiscountbyHsn/";
		
		ResponseEntity<List<SalesProduct>> res1=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<SalesProduct>>(){});
	List<SalesProduct> product1=res1.getBody();
	product1.forEach(x->{
		int hsn = x.getHsn();
		ResponseEntity<Integer> res2=rt.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
		int discount=res2.getBody();
		x.setNePrice(x.getNePrice()-x.getNePrice()*discount/100);																																						
	});
	return spd.setSalesProduct(product1);		
	}
	public ResponseEntity<List<SalesProduct>> getallObject(){
	String url="http://localhost:8090/A/getAll";
	ResponseEntity<List<SalesProduct>> f=rt.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<SalesProduct>>() {});
	return f;
	}
	//public List<SalesProduct> getallObject;
	//return f;

}
