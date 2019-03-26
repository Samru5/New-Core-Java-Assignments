package com.capgemini.exception.test;

import org.junit.Test;

import com.capgemini.exception.main.FactorialException;
import com.capgemini.exception.main.InvalidInputException;
import com.capgemini.exception.model.Factorial;

public class FactorialTest {

	@Test(expected = InvalidInputException.class)
	public void checkNumber() throws InvalidInputException, FactorialException {
		Factorial f = new Factorial(1);
		f.getFactorialValue();

	}

	@Test(expected = FactorialException.class)
	public void checkFactorial() throws InvalidInputException, FactorialException {
		Factorial f = new Factorial(13000);
		f.getFactorialValue();
	}

}
