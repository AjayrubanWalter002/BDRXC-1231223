package com.junit_project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.function.Supplier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.BeforeEach;
@SuppressWarnings("unused")
public class TestCalculator {
	Calculator c = new Calculator();

	@Before
	public void displayThis() {
		System.out.println("welcome");
	}

	@Test
	public void testAddition() {
		System.out.println(c.addition());
	}

	@Test
	public void testDivision() {
		System.out.println(c.division());
	}

	@Test
	public void testAssertSame() {
		assertEquals(c.addition(), c.division());
	}

	@Test
	public void testAssertNotEquals() {

		assertNotEquals(c.addition(), c.division());
	}

	@Test
	public void testAssertEquals() {
		assertEquals(c.nameReverse(), "naburyaja");
	}

	@Test
	public void TimeOutTest() {
		Calculator calci = new Calculator();
		assertTimeout(Duration.ofSeconds(5), () -> calci.getTimeOut(), "Time Outxt");
		Supplier<String> messageSupplier = () -> "oops time out";
		assertTimeout(Duration.ofSeconds(5), () -> calci.getTimeOut(), messageSupplier);
	}

	@After
	public void displayThat() {
		System.out.println("Thank you");
	}
}
