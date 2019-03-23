package tests;
import org.junit.Test;
import main.Date;
import static org.junit.Assert.*;

public class DateTest
	{
		@Test
		public void checkSmallerDate()
		{					
			Date d1=new Date(21,07,2018);
			Date d2=new Date(26,12,2021);
			assertEquals(true,d1.isSmaller(d2));		
		}

		@Test
		public void diff()
		{					
			Date t=new Date(23,04,2014);
			Date m=new Date(02,02,2000);
			assertEquals(1,t.findDiff(m));		
		}

}