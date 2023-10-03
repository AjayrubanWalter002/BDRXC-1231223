package com.tester.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tester.Entity.*;
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
