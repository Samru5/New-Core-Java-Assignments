package com.capgemini.files.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.client.EmployeeSerialization;
import com.capgemini.files.client.FileLineCountApplication;
import com.capgemini.files.model.Employee;

public class EmployeeSerializationTest {
	@Test
	public void checkFileExistsOrNot() {
		EmployeeSerialization file = new EmployeeSerialization();
		assertTrue(file.checkFileExistsOrNot());

	}

	@Test
	public void checkFileEmptyOrNot() {
		EmployeeSerialization file = new EmployeeSerialization();
		assertTrue(file.checkFileEmptyOrNot());

	}

	@Test
	public void doSerializationProcess() throws IOException {
		Employee e = new Employee(101, "Ajay", 87654);
		EmployeeSerialization emp = new EmployeeSerialization();
		assertTrue(emp.doSerialization("employee.ser", e));

	}

}