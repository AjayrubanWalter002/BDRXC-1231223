package com.tester.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tester.Repository.EmployeeRepository;
import com.tester.TesterApplication;
import com.tester.Entity.*;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository er;
    TesterApplication tp;
    public String setEmp(@RequestBody Employee e) {
    	er.save(e);
    	return "Saved SuccessFully";
    }
   
	
	public String setAllEmp(List<Employee> e) {
		er.saveAll(e);
		return "Saved SuccessFully";
	}
	public Employee getEmp() {
		return  er.findAll().get(0);
	}
}
