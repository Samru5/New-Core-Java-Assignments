package com.capgemini.employee.model;

public class Manager extends Employee {

	public Manager() {
		super();

	}

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		System.out.println(basicSalary);

	}

	public double calculateGrossSalary()

	{
		System.out.println(super.getBasicSalary());

		double petrolAllowance = 0.08 * super.getBasicSalary();
		double foodAllowance = 0.13 * super.getBasicSalary();
		double otherAllowance = 0.03 * super.getBasicSalary();
		System.out.println(super.calculateGrossSalary());
		return super.calculateGrossSalary() + petrolAllowance + foodAllowance + otherAllowance;
	}

	public double calculateNetSalary()

	{
		double PT = 200;
		double PF = 0.12 * super.getBasicSalary();
		double netSalary = super.calculateGrossSalary() - (PT + PF);
		return netSalary;
	}

	public static void main(String[] args) {
		Manager m = new Manager(100, "Tom", 20000, 100);
		System.out.println(m.calculateGrossSalary());
		System.out.println(m.calculateNetSalary());
	}
}
