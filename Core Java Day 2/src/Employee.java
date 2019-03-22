import java.util.*;
public class Employee
{
	int id;
	String name;
	double monthlyBasic;
	double annualBasic;
	double PF;
	double HRA;
	double professionalTax;
	double MonthlyGrossSalary;
	double AnnualGrossSalary;
	double MonthlyDeductions;
	double MonthlyTakeHome;
	double AnnualTakeHome;
	static double  medicalAllowance=1250.0;
	static double conveyanceAllowance=800.0;
	double ESIC;
	double monthlyGross;



public Employee()
{

}

public Employee(int id,String name,double monthlyBasic)
{
this.id=id;
this.name=name;
this.monthlyBasic=monthlyBasic;


}
 

	public double getAnnualBasic()
	{

	return 12*monthlyBasic;

	}



	public double getMonthlyGrossSalary()
	{
		HRA = 0.5 * monthlyBasic;
	if(0.1 * monthlyBasic<6500)
	{
		PF=0.1 * monthlyBasic;
	}

	else
	{
		PF=6500;
	}

		return MonthlyGrossSalary=monthlyBasic +HRA+ medicalAllowance + conveyanceAllowance;
	}

	public double getAnnualGrossSalary()
	{
		return 12 * MonthlyGrossSalary;
	}


	public double getMonthlyDeductions()
	{
		if(monthlyBasic <= 5000)
	{
		ESIC = 0.0475*monthlyBasic;  
	}
	if(0.1 * monthlyBasic<6500)
	{
		PF=0.1 * monthlyBasic;
	}

	else
	{
		PF=6500;
	}


if(monthlyGross<= 10000)
	{
		professionalTax=50;
	}

	else
	{
	professionalTax=100;
	}	

		return PF + ESIC +professionalTax; 
	}


	public double getMonthlyTakeHome()
	{
		return MonthlyTakeHome=MonthlyGrossSalary-MonthlyDeductions;
	}


	public double getAnnualTakeHome()
	{
		return 12 *MonthlyTakeHome;
	} 

	

}