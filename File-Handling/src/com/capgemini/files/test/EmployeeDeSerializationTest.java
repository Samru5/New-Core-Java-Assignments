package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.EmployeeDeSerialization;
import com.capgemini.files.model.Employee;

public class EmployeeDeSerializationTest {

	public void checkFileExistsOrNot() {
		EmployeeDeSerialization file = new EmployeeDeSerialization();
		assertTrue(file.checkFileExistsOrNot());

	}

	@Test
	public void checkFileEmptyOrNot() {
		EmployeeDeSerialization file = new EmployeeDeSerialization();
		assertTrue(file.checkFileEmptyOrNot());

	}

	@Test
	public void doDeSerializationProcess() throws IOException, ClassNotFoundException {
		Employee e = new Employee(101, "Ajay", 87654);
		EmployeeDeSerialization emp = new EmployeeDeSerialization();

		assertEquals(e, emp.doDeSerialization("employee.ser"));

	}

}
