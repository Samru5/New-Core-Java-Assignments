package tests;
import org.junit.Test;
import main.Country;
import static org.junit.Assert.*;
import org.junit.Before;

public class CountryTest
{
	Country crr[];
	
	@Before
	public void setUp()
	{
		crr=new Country[5];
		crr[0]=new Country("India",345678,876543);
		crr[1]=new Country("Aus",123456,980765);
		crr[2]=new Country("UK",786549,965432);
		crr[3]=new Country("US",765890,953429);
		crr[4]=new Country("USA",989065,564321);
	}

	@Test
	public void isAreaLargest()
	{
		Country expectedCountry=new Country("USA",989065,564321);
		Country actualCountry=new Country().isLargestArea(crr);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
	}

	@Test
	public void isPopulationLargest()
	{
		Country expectedCountry=new Country("Aus",123456,980765);
		Country actualCountry=new Country().isLargestPopulation(crr);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
	}

	@Test
	public void isDesnsityLargest()
	{
		Country expectedCountry=new Country("Aus",123456,980765);
		Country actualCountry=new Country().isLargestDensity(crr);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
	}

}