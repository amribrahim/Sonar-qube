package io.github.amribrahim.sonar;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void testAdd() {
		int a = 5, b = 6;
		int c = Add.add(a, b);
		assertTrue(c == 11);
	}
	
	@Test
	public void testSubtract() {
		int a = 5, b = 6;
		int c = Add.subtract(a, b);
		assertTrue(c == -1);
	}

}
