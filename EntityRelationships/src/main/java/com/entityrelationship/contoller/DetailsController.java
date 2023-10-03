package com.entityrelationship.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entityrelationship.entity.Employee;
import com.entityrelationship.repository.EmployeeRepo;

@RestController
@Repository
public class DetailsController {
	@Autowired
	EmployeeRepo repo;

	@PostMapping("/saveAllEmployee")
	public String setAll(@RequestBody List<Employee> details) {
		repo.saveAll(details);
		return "Save";

	}
}
