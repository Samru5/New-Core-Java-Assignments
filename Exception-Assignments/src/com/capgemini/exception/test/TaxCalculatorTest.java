package com.capgemini.exception.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.exception.main.CountryNotValidException;
import com.capgemini.exception.main.EmployeeNameInvalidException;
import com.capgemini.exception.main.TaxNotEligibleException;
import com.capgemini.exception.model.TaxCalculator;

public class TaxCalculatorTest {

	@Test(expected = CountryNotValidException.class)
	public void checkIsIndianOrNot()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		TaxCalculator t = new TaxCalculator();
		t.calCulateTax("Ron", false, 34000);

	}

	@Test(expected = EmployeeNameInvalidException.class)
	public void checkIsvalidName()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		TaxCalculator t = new TaxCalculator();
		t.calCulateTax("", true, 30000);
	}

	@Test(expected = TaxNotEligibleException.class)
	public void checktaxEligibleOrNot()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		TaxCalculator t = new TaxCalculator();
		t.calCulateTax("Tim", true, 1000);
	}
}