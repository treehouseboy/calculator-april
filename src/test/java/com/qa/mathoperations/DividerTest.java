package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest {

	@Test
	public void test() {
		Divider divideTest = new Divider();
		int actualResult = divideTest.divide(10,5);
		Assert.assertEquals(2, actualResult);
	}

}