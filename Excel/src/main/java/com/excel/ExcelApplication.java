package com.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.excel.Entity.*;
import com.excel.Service.StudentService;

@SpringBootApplication
public class ExcelApplication{ 
//implements CommandLineRunner{
@Autowired
StudentService ss;
	public static void main(String[] args) {
		SpringApplication.run(ExcelApplication.class, args);
	}
//	@Override
//    public void run(String...a) {
//        for (int i = 0; i <= 10; i++) {
//            Student student = new Student();
//            student.setRollNo(i);
//            student.setName(null);
//            student.setTotalMarks(i);
//            student.setResult(null);
//            ss.addStudent(student);
//        }
//    }

}
