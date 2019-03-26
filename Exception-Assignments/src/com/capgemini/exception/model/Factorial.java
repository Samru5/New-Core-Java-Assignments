package com.capgemini.exception.model;

import com.capgemini.exception.main.FactorialException;
import com.capgemini.exception.main.InvalidInputException;

public class Factorial {
	private long number;

	public Factorial() {
		super();
	}

	public Factorial(long number) {
		super();
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public void getFactorialValue() throws InvalidInputException, FactorialException {
		long fact = 1;
		if (number < 2) {
			throw new InvalidInputException("Invalid input");
		} else {
			for (long i = 1; i <= number; i++) {
				fact = fact * i;
				if (fact > Integer.MAX_VALUE) {
					throw new FactorialException("Invalid input");
				}
			}

		}
	}
}
