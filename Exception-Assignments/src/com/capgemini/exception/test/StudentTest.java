package com.capgemini.exception.test;

import org.junit.Test;

import com.capgemini.exception.main.AgeNotWithinRangeException;
import com.capgemini.exception.main.NameNotValidException;
import com.capgemini.exception.model.Student;

public class StudentTest {

	@Test(expected = AgeNotWithinRangeException.class)
	public void checkAge() throws AgeNotWithinRangeException {
		Student s = new Student(1, 32, "John", "Computer");
		s.checkAge();

	}

	@Test(expected = NameNotValidException.class)
	public void checkBName() throws NameNotValidException {
		Student s = new Student();
		s.checkName("J1hn");

	}

}
