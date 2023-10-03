package com.studentresult.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentresult.entity.Results;
import com.studentresult.service.ResultService;
import java.util.List;
@RestController
@RequestMapping(value="/A")
public class ResultsController {
@Autowired
ResultService rs;
//@PostMapping("/setALLMARKS")
//	public String setAllMarks() {
//	return rs.setAllMarks();
	//}

@PostMapping("/setResults")
	public String setResult(){
		return rs.setResult();
	}
@GetMapping("getAllResults")
	public List<Results> getallResult(){
		return rs.getallResult();
	}
@GetMapping("getByName/{studentname}")
public List<Results> getbyName(@PathVariable String studentname) {
	return rs.getbyName(studentname);
}
@GetMapping("/getTheTopper")
	public Results getTopper() {
		return rs.getTopper();
	}
@GetMapping("getTopThree")
public List<Results> gettopThree(){
	return rs.gettopThree();
}
@GetMapping("descOrder")
public List<Results> orderdec(){
	return rs.orderDesc();
}
}


