package com.schoolfinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResultService {
@Autowired
RestTemplate rt;
@Autowired
ResultDao dao;
	public String postResult() {
		String url1="http://localhost:8080/getAll";
		  String url2="http://localhost:8081/getbyRollNo/";
		  ResponseEntity<List<Result>> res1=rt.exchange(url1, HttpMethod.GET,null,new ParameterizedTypeReference<List<Result>> (){});
		  List<Result> p1=res1.getBody();
		  p1.forEach(x->{
			  int rollno=x.getRollNo();
			  ResponseEntity<Integer> res2=rt.exchange(url1+rollno,HttpMethod.GET,null,Integer.class);
			  int rolls=res2.getBody();
			  x.setRollNo(x.getRollNo());
			  x.setName(x.getName());
			  x.setAverage(x.getTotalmark()/5);
		  });
//		  return dao.postResult(p1);
		  return null;
	}
	
}
