	package com.studentmark;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Repository
public class StudentController {

	@Autowired
	StudentRepo sr;

	@Autowired
	RestTemplate rt;

	String url = "http://localhost:8081/getByrollNo/";
	String url1 = "http://localhost:8080/getDetail";	

	@PostMapping("/post")
	public String post() {
		ResponseEntity<List<ObjClass>> li = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ObjClass>>() {
				});
		List<ObjClass> objLi = li.getBody();

		List<Student> s = new ArrayList<>();

		Student s1 = new Student();
		for (ObjClass k : objLi) {

			ResponseEntity<Integer> total = rt.exchange(url + k.getRollNo(), HttpMethod.GET, null, Integer.class);
			int a = total.getBody();

			s1.setName(k.getStuName());
			s1.setRollNo(k.getRollNo());
			s1.setAvg(a / 5);
			s.add(s1);

		}
		sr.saveAll(s);
		return "Saved";
	}

	@GetMapping("/getAll")
	public List<Student> getAll() {
		return sr.findAll();
	}

}
