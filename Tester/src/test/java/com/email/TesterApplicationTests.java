package com.email;

import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tester.Controller.EmployeeController;
import com.tester.Entity.Employee;



@SpringBootTest
class TesterApplicationTests {
    @Autowired
    EmployeeController ec;
	@Test
	void contextLoads() {
	}
	String a="Saved";
	String b="Saved All";
	@SuppressWarnings("unused")
	@Test
	public void testcase
	
}