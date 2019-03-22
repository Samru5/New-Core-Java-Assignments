class EmployeeMain
{

public static void main(String args[])
	{

double annualBasic=0;
double MonthlyGrossSalary=0;
double AnnualGrossSalary=0;
double MonthlyDeductions=0;
double MonthlyTakeHome=0;
double AnnualTakeHome=0;

	Employee e=new Employee(1,"John",20000);
	annualBasic=e.getAnnualBasic();
	System.out.println("Your annual basic is-"+annualBasic);


	MonthlyGrossSalary=e.getMonthlyGrossSalary();
	System.out.println("Your MonthlyGrossSalary is-"+MonthlyGrossSalary);


	AnnualGrossSalary=e.getAnnualGrossSalary();
	System.out.println("Your AnnualGrossSalary is-"+AnnualGrossSalary);


	MonthlyDeductions=e.getMonthlyDeductions();
	System.out.println("Your MonthlyDeductions is-"+MonthlyDeductions);


	MonthlyTakeHome=e.getMonthlyTakeHome();
	System.out.println("YourMonthlyTakeHome is-"+MonthlyTakeHome);

	AnnualTakeHome=e.getAnnualTakeHome();
	System.out.println("Your AnnualTakeHome is-"+AnnualTakeHome);

}
}
