package com.qa.mathoperations;


import org.junit.Assert;
import org.junit.Test;

public class SubtractorTest {

	@Test
	public void test() {
		Subtractor subtractTest = new Subtractor();
		int actualResult = subtractTest.subtract(6,3);
		Assert.assertEquals(3, actualResult);
		
	}

}
