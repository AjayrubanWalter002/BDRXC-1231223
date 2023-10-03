package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContextException;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@SuppressWarnings({ "unchecked", "unused" })
class MockTestApplicationTests {

	@Autowired
	private TestController controller;
	@Autowired
	private TestService service;
	@MockBean
	private TestRepository repository;

	
	@BeforeAll
	static void initBefore() {
		System.out.println("This Method Run before ");
	}
	
	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("Test For Get Service")
	public void testCase1() {
		try {
			TestEntity tests = new TestEntity();
			tests.setName(null);
			tests.setAge(10);
			tests.setLocation("america");

			List<TestEntity> testsMain = new ArrayList<>();
			testsMain.add(tests);
			Mockito.when(repository.findAll()).thenReturn(testsMain);
			List<TestEntity> testsResult = service.showAll();
			boolean sizes = testsResult.size() > 0 ? true : false;
			int size = testsResult.size();
			boolean nulls=testsResult.contains(null);
			assertEquals(sizes, false);
			assertEquals(size, 0);
			assertNull(tests);
			assertEquals(tests, testsResult);
			
			
		} catch (Exception e) {
//			throw e		
			e.printStackTrace();
			System.out.println("The Data Is Mocked");
		}
	}

	@Test
	public void test_True() {
		assertTrue(10 > 9);
		
	}
	
	@Test
	public void test_null() {
		String names=null;
		assertNotNull(names);
	}
	@Test
	public void test_null2() {
		String names2="Ajay";
		int na=Integer.parseInt(names2);
		assertNull(names2);
	}
	@Test
	public void test_Throws() {
		
		
	}
	public void timeOutTest() {
		int a=20+10;
		
		
	}

}
