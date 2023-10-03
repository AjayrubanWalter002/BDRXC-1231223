package com.junit_project;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	
//	assertTimeout(Duration.ofSeconds(5), () -> appleCalculator.getTimeout());
//    assertTimeout(Duration.ofSeconds(5), () -> appleCalculator.getTimeout(), "oops time out");

}
