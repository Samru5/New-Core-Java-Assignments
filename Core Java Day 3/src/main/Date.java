package main;
public class Date
{
 	int day; 
   	int month;
  	 int year; 
	int arr[]=new int[3];

 	public Date()
	{

	}

	public Date(int day,int month,int year) 
   	 { 
        this.day = day; 
        this.month = month; 
        this.year = year; 
    	  
    	} 

	public boolean isSmaller(Date d)
	{

		if(day<d.day && month<d.month && year<d.year)
		{
			return true;
		}
		return false;
	}

	public int findDiff(Date g)
	{
		int days;
		int months;
		int years;

	if(day>g.day && month>g.month && year>g.year)
	{
		days=day-g.day;
		months=month-g.month;
		years=year-g.year;
		return 1;
	}
	return 0;
}

}