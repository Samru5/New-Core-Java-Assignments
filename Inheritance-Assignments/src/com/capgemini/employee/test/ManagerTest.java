package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Employee;
import com.capgemini.employee.model.Manager;

public class ManagerTest {

	@Test
	public void calculateGrossSalary() {
		Manager m = new Manager(100, "Tom", 20000, 100);
		assertEquals(34900, m.calculateGrossSalary(), 0.01);
	}

	@Test
	public void calculateNetSalary() {
		Manager m = new Manager(100, "Tom", 20000, 100);
		assertEquals(27500.0, m.calculateNetSalary(), 0.01);
	}

}
