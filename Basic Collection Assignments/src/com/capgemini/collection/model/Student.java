package com.capgemini.collection.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private String course;

	public Student() {
		super();

	}

	public Student(String name, int id, String course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int hashCode() {

		return Objects.hash(name);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof School))
			return false;
		if (obj == this)
			return true;
		Student s = (Student) obj;
		if (name == s.name)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
}
