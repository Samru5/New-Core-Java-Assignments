package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Employee;

public class EmployeeTest {
	private Employee e;

	@Before
	public void setUp() {
		e = new Employee(100, "Tom", 20000, 100);
	}

	@Test
	public void checkEmployeeObjectIsCreatedWithDefaultConstructor() {
		Employee e = new Employee();
		assertNotNull(e);

	}

	@Test
	public void checkEmployeeObjectIsCreatedWithParameterizedConstructor() {
		Employee e = new Employee(100, "Tom", 20000, 100);
		assertNotNull(e);
		assertEquals(100, e.getEmployeeId());
		assertEquals("Tom", e.getEmployeeName());
		assertEquals(20000, e.getBasicSalary(), 0.01);
		assertEquals(100, e.getMedical(), 0.01);
	}

	@Test
	public void calculategrossSalary() {
		e.calculateGrossSalary();
		assertEquals(30100.0, e.getGrossSalary(), 0.01);
	}

	@Test
	public void calculateNetSalary() {
		e.calculateGrossSalary();
		e.calculateNetSalary();
		assertEquals(27500.0, e.getNetSalary(), 0.01);
	}
}
