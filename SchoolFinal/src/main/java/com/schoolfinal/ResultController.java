package com.schoolfinal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResultController {
	@Autowired
	RestTemplate rt;
	@Autowired
	ResultService service;
	@Autowired
	ResultRepository repo;

	@PostMapping("/postResult")
	public String PostResult() {
		return service.postResult();
	}

	@PostMapping("/postFinal")
	public String postFinal() {
		Result r = new Result();
		String url1 = "http://localhost:8080/getAll";
		String url2 = "http://localhost:8081/getAllMarks";
		List<Result> re = new ArrayList<>();
		ResponseEntity<List<DetailPojo>> service1 = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<DetailPojo>>() {
				});
		List<DetailPojo> res1 = service1.getBody();
		res1.forEach(x -> {
			r.setName(x.getStuName());
			r.setRollNo(x.getRollNo());

		});
		ResponseEntity<List<MarkPojo>> service2 = rt.exchange(url2, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<MarkPojo>>() {
				});
		List<MarkPojo> res2 = service2.getBody();
		res2.forEach(y -> {
			r.setTotalmark(
					y.getTamilMark() + y.getEnglishMark() + y.getMathsMark() + y.getScienceMark() + y.getSocialMark());
			r.setAverage(y.getTotalMark() / 5);
		});

		List<Result> res = new ArrayList<>();
		res.add(r);
		repo.saveAll(res);
		return "saved";

	}
//	---------------------------------------------------------------------------------

	@PostMapping("/postAll")
	public String postAlls() {
		Result rs = new Result();
		String urls1 = "http://localhost:8080/getAll";

		ResponseEntity<List<DetailPojo>> ser1 = rt.exchange(urls1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<DetailPojo>>() {
				});
		List<DetailPojo> re1 = ser1.getBody();
		for (DetailPojo p : re1) {
			rs.setRollNo(p.getRollNo());
			rs.setName(p.getStuName());
		}
		String urls2 = "http://localhost:8081/getAllMarks";
		ResponseEntity<List<MarkPojo>> ser2 = rt.exchange(urls2, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<MarkPojo>>() {
				});
		List<MarkPojo> re2 = ser2.getBody();
		for (MarkPojo m : re2) {
			int total = m.getTamilMark() + m.getEnglishMark() + m.getMathsMark() + m.getScienceMark()
					+ m.getSocialMark();
//		 rs.setTotalmark(m.getTamilMark()+m.getEnglishMark()+m.getScienceMark()+m.getSocialMark()+m.getMathsMark());
			rs.setTotalmark(total);
			rs.setAverage(total / 5);
		}
		List<Result> ress = new ArrayList<>();
		ress.add(rs);
		repo.saveAll(ress);
		return "Saved";
	}
//	------------------------------------------------------------------------------------------------------
	@PostMapping("/lastPost")
	public String finals() {
	    List<Result> ress = new ArrayList<>();

	    String urls1 = "http://localhost:8080/getAll";
	    ResponseEntity<List<DetailPojo>> ser1 = rt.exchange(urls1, HttpMethod.GET, null,
	            new ParameterizedTypeReference<List<DetailPojo>>() {});
	    List<DetailPojo> re1 = ser1.getBody();
	    for (DetailPojo p : re1) {
	        Result rs = new Result(); // Create a new Result object for each DetailPojo
	        rs.setId(p.getId());
	        rs.setRollNo(p.getRollNo());
	        rs.setName(p.getStuName());
	        
	        String urls2 = "http://localhost:8081/getAllMarks";
	        ResponseEntity<List<MarkPojo>> ser2 = rt.exchange(urls2, HttpMethod.GET, null,
	                new ParameterizedTypeReference<List<MarkPojo>>() {});
	        List<MarkPojo> re2 = ser2.getBody();
	        for (MarkPojo m : re2) {
//	            int total = m.getTamilMark() + m.getEnglishMark() + m.getMathsMark() + m.getScienceMark()
//	                    + m.getSocialMark();
//	            rs.setTotalmark(total);
//	            rs.setAverage(total / 5);
	   		 rs.setTotalmark(m.getTotalMark());
             rs.setAverage(m.getTamilMark()+m.getEnglishMark()+m.getScienceMark()+m.getSocialMark()+m.getMathsMark()/5);
	        }

	        ress.add(rs); // Add the Result object to the list
	    }

	    repo.saveAll(ress); // Save all Result objects to the repository
	    return "Saved";
	}
//	------------------------------------------------------------------------------------------------
	@PostMapping("/A")
	public String lastandLast() {
	    List<Result> ress = new ArrayList<>();
	    String urls1 = "http://localhost:8080/getAll";
	    ResponseEntity<List<DetailPojo>> ser1 = rt.exchange(urls1, HttpMethod.GET, null,
	            new ParameterizedTypeReference<List<DetailPojo>>() {});
	    List<DetailPojo> re1 = ser1.getBody();
	    for (DetailPojo p : re1) {
	        String urls2 = "http://localhost:8081/getAllMarks";
	        ResponseEntity<List<MarkPojo>> ser2 = rt.exchange(urls2, HttpMethod.GET, null,
	                new ParameterizedTypeReference<List<MarkPojo>>() {});
	        List<MarkPojo> re2 = ser2.getBody();
	        for (MarkPojo m : re2) {
	            Result rs = new Result();
	            rs.setId(p.getId() + "-" + m.getId()); // Use a unique identifier
	            rs.setRollNo(p.getRollNo());
	            rs.setName(p.getStuName());
	            rs.setTotalmark(m.getTotalMark());
	            rs.setAverage((m.getTamilMark() + m.getEnglishMark() + m.getScienceMark() + m.getSocialMark() + m.getMathsMark()) / 5);
	            ress.add(rs);
	        }
	    }

	    repo.saveAll(ress);
	    return "Saved";
	}

}
