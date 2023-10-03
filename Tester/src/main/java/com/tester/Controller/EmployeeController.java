package com.tester.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tester.Entity.*;
import com.tester.Service.EmployeeService;
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService es;
  @PostMapping("/setEmployee")
  public String setEmp(Employee e) {
	   return es.setEmp(e);
  }
  public String setAllEmp(@RequestBody List<Employee> e) {
 	 return es.setAllEmp(e);
  }
  @GetMapping("/getEmp")
	  public Employee getEmp() {
	  return es.getEmp();
  }
}
