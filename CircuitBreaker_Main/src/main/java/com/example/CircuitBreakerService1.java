package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CircuitBreakerService1 {

	@Autowired
	RestTemplate rt;

	@Autowired
	CircuitBreakerFactory cbf;

	@Autowired
	CircuitBreaker2Application cb2;

	public String callCb1() {
		CircuitBreaker cb = cbf.create("CircuitBreaker1");
		return cb.run(() -> rt.getForObject("http://localhost:8082/main2", String.class), throwable -> fallBackCb1());
//    	String name=rt.getForObject("http://localhost:8081/main2", String.class);
//    	return name;
//		CircuitBreaker cb=cbf.create("CircuitBreaker2");
//		return cb.run(()->rt.getForObject("http://localhost:8082/main2",String.class,throwable->fallback1()) ;
	}

	public String fallBackCb1() {
		return "This is the fall back";
	}

	public ResponseEntity<String> fallBackService() {
//		return rt.getForObject(" http://localhost:8083/main3",String.class);
		String url = "http://localhost:8083/main3";
		ResponseEntity<String> urls = rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
		});
		return urls;
	}

	public ResponseEntity<String> fallbackCb3() {
//		return rt.getForEntity("http://localhost:8083/main3",String.class);
		return new ResponseEntity<String>("new Fall Back", HttpStatus.ACCEPTED);
	}

}
