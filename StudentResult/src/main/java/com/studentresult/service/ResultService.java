package com.studentresult.service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.studentresult.dao.ResultDao;
import com.studentresult.entity.Results;
import com.studentresult.entity.StudentDetails;
import com.studentresult.entity.StudentMarkSheet;

@Service
public class ResultService {
	@Autowired
	RestTemplate rt;
	@Autowired
	ResultDao rd;
//public String setAllMarks() {
	// String url1="http://localhost:8082/AllStudent";
	// String url2="http://localhost:8083/getAllMark";
	// ResponseEntity<List<Results>> r1=rt.exchange(url1, HttpMethod.GET,null,new
	// ParameterizedTypeReference<List<Results>>() {});
	// List<Results> ser1=r1.getBody();
	// ResponseEntity<List<Results>> r2=rt.exchange(url2, HttpMethod.GET,null,new
	// ParameterizedTypeReference<List<Results>>() {});
	// List<Results>ser2=r2.getBody();
	// ser1.forEach(y->{
	// 0 ResponseEntity<List<Results>> r2=rt.exchange(url1+url2,
	// HttpMethod.GET,null,new ParameterizedTypeReference<List<Results>>() {});
	// List<Results>s=r2.getBody();
	// y.setId(y.getId());
	// y.setName(y.getName());
	// y.setRollNumber(y.getTotalMarks()/2);
	// y.setTotalMarks(y.getTotalMarks());
	// y.setPercentage(y.getPercentage());
	// });
	// return rd.setAllMarks(ser1);

	// for(R esults s:ser1) {
	// s.setId(s.getId());
	// s.setName(s.getName());
	// s.setRollNumber(s.getRollNumber());
	// s.setTotalMarks(s.getTotalMarks()/2);
	// s.setPercentage(s.getTotalMarks()/100);
	// }

	// List<Results> t=
	// for(Results d:ser2) {
	// }
//  return rd.setAllMarks(ser1);
//}
//public String setAllMarks1() {
	// String url2="http//loclhost:8082/getMark";
//	ResponseEntity<List<Results>> r2=rt.exchange(url2, HttpMethod.GET,null,new ParameterizedTypeReference<List<Results>>() {});
	// List<Results>ser2=r2.getBody();
//	   for(Results d:ser2) {
	// d.setId(d.getId());
	// d.setName(d.getName());
	// d.setRollNumber(d.getRollNumber());
	// d.setTotalMarks(d.getTotalMarks()/2);
	// d.setPercentage(d.getTotalMarks()/100);
	// }
	// return rd.setAllMarks(ser2);
//}
	public String setResult() {
		String url1 = "http://localhost:8082/getDetail";
		String url2 = "http://localhost:8083/getAllMark";
		ResponseEntity<List<StudentDetails>> s1 = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentDetails>>() {
				});
		List<StudentDetails> res1 = s1.getBody();
		ResponseEntity<List<StudentMarkSheet>> s2 = rt.exchange(url2, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentMarkSheet>>() {
				});
		List<StudentMarkSheet> res2 = s2.getBody();
		List<Results> f = new LinkedList<>();
		for (StudentDetails s : res1) {
			Results r = new Results();
			r.setName(s.getName());
			r.setRollNumber(s.getRollNumber());
			int attendance = s.getAttendance();
			int totalMarks = 0;

			int id = s.getId();
			for (StudentMarkSheet m : res2) {
				int id1 = m.getId();
				if (id == id1) {
					totalMarks = m.getSem1Total() + m.getSem2Total();
				}
			}
			if (attendance > 90 && attendance <= 95) {
				totalMarks = totalMarks + 5;
			}
			r.setTotalMarks(totalMarks);
			r.setPercentage(totalMarks / 2);
			f.add(r);
		}
		return rd.setResult(f);
	}

	public List<Results> getallResult() {

		return rd.getallResult();
	}

	public List<Results> getbyName(String studentname) {
		List<Results> s = getallResult();
		List<Results> r = s.stream().filter(k -> k.getName().equalsIgnoreCase(studentname))
				.collect(Collectors.toList());
		return r;
	}

	public Results getTopper() {

		return rd.getTopper();
	}

	public List<Results> gettopThree() {
		return rd.gettopThree();
	}

	public List<Results> orderDesc() {

		return rd.orderDesc();
	}

}
