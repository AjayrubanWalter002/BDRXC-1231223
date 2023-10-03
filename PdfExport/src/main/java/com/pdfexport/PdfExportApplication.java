package com.pdfexport;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pdfexport.Entity.Employee;
import com.pdfexport.Repository.EmployeeRepository;

@SpringBootApplication
public class PdfExportApplication {

	@Autowired
    EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PdfExportApplication.class, args);
	}
	 public void run(String... args) throws Exception {

	        if (repository.count() == 0) {
	            // save a list of Employees
	        	
	        	
	        	repository.saveAll(Arrays.asList(new Employee("", ""),new Employee( "","")));
//	        	repository.save(run(args));
//	        	repository.saveAll(Arrays.asList
	        			
//                       ( new Employee("AjayRuban", "AnthonySamy"), 
//                           new Employee("Suresh", "Devadass"),
//                             new Employee("ArunKumar", "Murugan"), 
//                                new Employee("Dananjayan", "Mani"),
//                                   new Employee("Jeeva", "Sekar"), 
//                                     new Employee("Ishivaka", "Yusuke")));
//	        }
	        			
	        }
	    }
}
