package com.capgemini.employee.model;

public class MarketingExecutive extends Employee {

	public double distance;

	public MarketingExecutive() {
		super();

	}

	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical,
			double distance) {
		super(employeeId, employeeName, basicSalary, medical);
		this.distance = distance;
	}

	public double calculateGrossSalary() {

		double telephoneAllowance = 1500;
		double tourAllowance = 5 * distance;

		System.out.println(super.calculateGrossSalary());
		return super.calculateGrossSalary() + tourAllowance + telephoneAllowance;

	}

	public double calculateNetSalary()

	{
		double PT = 200;
		double PF = 0.12 * super.getBasicSalary();
		double netSalary = super.calculateGrossSalary() - (PT + PF);
		System.out.println(netSalary);
		return netSalary;
	}

}
