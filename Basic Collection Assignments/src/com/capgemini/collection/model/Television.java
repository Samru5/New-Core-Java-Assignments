package com.capgemini.collection.model;

import java.util.Objects;

public class Television {

	private String company;
	private String type;
	private boolean enabled3D;
	private double price;

	public Television() {
		super();

	}

	public Television(String company, String type, boolean enabled3d, double price) {
		super();
		this.company = company;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEnabled3D() {
		return enabled3D;
	}

	public void setEnabled3D(boolean enabled3d) {
		enabled3D = enabled3d;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {

		return Objects.hash(company, type, price);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof School))
			return false;
		if (obj == this)
			return true;
		Television t = (Television) obj;
		if (company == t.company && type == t.type && price == t.price)
			return true;
		else
			return false;
	}
}
