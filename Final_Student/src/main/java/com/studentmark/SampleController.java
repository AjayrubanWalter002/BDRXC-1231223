//package com.studentmark;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//
//
//public class SampleController {
//	@Autowired
//	RestTemplate rt;
//  public String posting() {
//	  String url1="http://localhost:8081/getByrollNo/";
//	  String url2="http://localhost:8080/getDetail";
//	  ResponseEntity<List<ObjClass>> res1=rt.exchange(url1, HttpMethod.GET,new ParameterizedTypeReference<List<ObjClass>> (){});
//	  List<ObjClass> p1=res1.getBody();
//	  p1.forEach(x->{
//		  int roll=x.getRollNo();
//		  ResponseEntity<Integer> res2=rt.exchange(url2+roll,HttpMethod.GET,Integer.class);
//		  int rolls=res2.getBody();
//		  x.setStuName(x.getStuName());
//		  x.setRollNo(x.getRollNo());
//		  x.s 
//	  });
//  }
//}
//
//
////public String setSalesProduct() {
////	String url1="http://localhost:8080/getAll";
////	String url2="http://localhost:8081/getDiscountbyHsn/";
////	
////	ResponseEntity<List<SalesProduct>> res1=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<SalesProduct>>(){});
////List<SalesProduct> product1=res1.getBody();
////product1.forEach(x->{
////	int hsn = x.getHsn();
////	ResponseEntity<Integer> res2=rt.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
////	int discount=res2.getBody();
////	x.setNePrice(x.getNePrice()-x.getNePrice()*discount/100);
////});
////return spd.setSalesProduct(product1);		
////}
////public ResponseEntity<List<SalesProduct>> getallObject(){
////String url="http://localhost:8090/A/getAll";
////ResponseEntity<List<SalesProduct>> f=rt.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<SalesProduct>>() {});
////return f;
////}
//////public List<SalesProduct> getallObject;
//////return f;