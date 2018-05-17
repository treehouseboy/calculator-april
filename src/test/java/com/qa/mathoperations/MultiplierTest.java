package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {

	@Test
	public void test() {
		Multiplier multiplierTest = new Multiplier();
		int actualResult = multiplierTest.multiply(6,3);
		Assert.assertEquals(18, actualResult);
	}

}
