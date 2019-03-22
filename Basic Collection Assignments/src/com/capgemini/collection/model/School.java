package com.capgemini.collection.model;

import java.util.Objects;

public class School implements Comparable<School> {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;

	public School() {
		super();

	}

	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchooldistrict() {
		return schoolDistrict;
	}

	public void setSchooldistrict(String schooldistrict) {
		this.schoolDistrict = schooldistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public int hashCode() {

		return Objects.hash(name, city, schoolDistrict);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof School))
			return false;
		if (obj == this)
			return true;
		School s = (School) obj;
		if (name == s.name && city == s.city && schoolDistrict == s.schoolDistrict)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(School s) {
		return name.compareTo(s.name);
	}

}
