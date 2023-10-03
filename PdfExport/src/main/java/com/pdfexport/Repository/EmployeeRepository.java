package com.pdfexport.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.support.DefaultCrudMethods;

import com.pdfexport.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
