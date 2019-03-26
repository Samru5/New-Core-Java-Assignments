package com.capgemini.exception.model;

import com.capgemini.exception.main.CountryNotValidException;
import com.capgemini.exception.main.EmployeeNameInvalidException;
import com.capgemini.exception.main.TaxNotEligibleException;

public class TaxCalculator {
	public TaxCalculator() {

	}

	public double calCulateTax(String employeeName, boolean isIndian, double salary)
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		double taxAmount;
		if (isIndian != true) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}

		if (employeeName.equals(null) || employeeName.equals("")) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}

		if (salary >= 100000 && isIndian == true) {
			taxAmount = salary * 8 / 100;
		}

		else if (salary >= 50000 && salary <= 100000 && isIndian == true) {
			taxAmount = salary * 6 / 100;
		}

		else if (salary >= 30000 && salary <= 50000 && isIndian == true) {
			taxAmount = salary * 5 / 100;
		}

		else if (salary >= 10000 && salary <= 30000 && isIndian == true) {
			taxAmount = salary * 4 / 100;
		}

		else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		return taxAmount;
	}
}
