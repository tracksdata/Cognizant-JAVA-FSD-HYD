package com;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.calc.Calculator;

public class MyTest {
	

	Calculator calc = null;

	@Before
	public void getCalcObject() { // Act
		calc = new Calculator();
	}

	@Test
	public void calculateSum() {
		
		//assertEquals(40, calc.sum(20, 20));
		//assertThat(false, is(100>20));

	}


}
