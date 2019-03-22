package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;
import com.capgemini.employee.model.MarketingExecutive;

class MarketingExecutiveTest {

	private MarketingExecutive s;

	@Test
	public void calculateGrossSalary() {
		MarketingExecutive s = new MarketingExecutive(100, "Tom", 20000, 100, 50);
		assertEquals(31850.0, s.calculateGrossSalary(), 0.01);
	}

	@Test
	public void calculateNetSalary() {
		MarketingExecutive s = new MarketingExecutive(100, "Tom", 20000, 100, 50);
		assertEquals(27500.0, s.calculateNetSalary(), 0.01);
	}

}
