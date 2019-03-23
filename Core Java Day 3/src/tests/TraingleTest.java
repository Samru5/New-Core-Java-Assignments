package tests;
import org.junit.Test;
import main.Traingle;
import static org.junit.Assert.*;

public class TraingleTest
{

	@Test
	public void testEquilateral()
	{
		Traingle t1=new Traingle(5,5,5);
		assertTrue(t1.isEquilateral());
	}

	@Test
	public void testIsosceles()
	{
		Traingle t2=new Traingle(4,7,4);
		assertTrue(t2.isIsosceles());		
	}

	@Test
	public void testScalene()
	{
		Traingle t3=new Traingle(1,8,6);	
		assertTrue(t3.isScalene());	
	}

	@Test
	public void testRightAngled()
	{
		Traingle t4=new Traingle(3,4,5);
		assertTrue(t4.isRight());	
	}

	public void testNotRightAngled()
	{
		Traingle t5=new Traingle(2,3,6);
		assertFalse(t5.isRight());	
	}



}