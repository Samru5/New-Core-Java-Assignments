package com.capgemini.exception.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exception.main.AgeNotWithinRangeException;
import com.capgemini.exception.main.NameNotValidException;

public class Student {
	private int rollNumber;
	private int age;
	private String name;
	private String course;

	public Student() {
		super();

	}

	public Student(int rollNumber, int age, String name, String course) {
		super();
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
		this.course = course;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int checkAge() throws AgeNotWithinRangeException {
		if (age >= 15 && age <= 21) {
			System.out.println("Age is within the range");
		} else {
			throw new AgeNotWithinRangeException("Age is not within the range");
		}
		return age;

	}

	public void checkName(String name) throws NameNotValidException {
		if (!(name.matches("^[a-zA-z]*$"))) {
			throw new NameNotValidException("Name is not valid");

		}
	}

}
