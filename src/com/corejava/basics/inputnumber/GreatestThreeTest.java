package com.corejava.basics.inputnumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreatestThreeTest {

	@Test
	public void testMain() {

		GreatestThree test = new GreatestThree();
		assertEquals(20, test.greatestNumber(20, 21, 22));
		
	}

}
