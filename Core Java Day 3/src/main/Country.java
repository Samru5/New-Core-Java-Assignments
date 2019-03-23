package main;
public class Country
{
	private String countryName;
	private long area;
	private long population;
	private long density;
	
	public Country()
	{

	}

	public Country(String countryName,long area,long population)
	{

	this.countryName=countryName;
	this.area=area;
	this.population=population;
	}

	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}

	public String getCountryName()
	{
	return countryName;

	}


	public void setArea(long area)
	{
		this.area=area;
	}

	public long getArea()
	{
		return area;
	}

	public void setPopulation(long population)
	{
		this.population=population;
	}

	public long getPopulation()
	{
		return population;

	}

	public Country isLargestArea(Country crr[])
	{
	int index=0;
	long max=crr[0].area;;
	for(int i=1;i<crr.length;i++)
	{
		
		if(max<crr[i].area)
		{
			max=crr[i].area;
			index=i;
		}
	}
	return crr[index];
	}

	public Country isLargestPopulation(Country crr[])
	{
	int index=0;
	long max=crr[0].population;
	for(int i=1;i<crr.length;i++)
	{
		
		if(max<crr[i].population)
		{
			max=crr[i].population;
			index=i;
		}
	}
	return crr[index];
	}


public Country isLargestDensity(Country crr[])
	{
		int index=0;
		
		double density[]=new double[5];
		for(int i=0;i<crr.length;i++)
		{
			density[i]=crr[i].population / crr[i].area;
		}
	double max=density[0];
	for(int i=1;i<density.length;i++)
	{
		
		if(max<density[i])
		{
			max=density[i];
			index=i;
		}
	}
	return crr[index];
	}
	
	
	
}

