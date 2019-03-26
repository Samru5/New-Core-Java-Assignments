package com.capgemini.exception.test;

import org.junit.Test;

import com.capgemini.exception.main.InvalidDayException;
import com.capgemini.exception.main.InvalidMonthException;
import com.capgemini.exception.model.MyDate;

public class MyDateTest {

	@Test(expected = InvalidDayException.class)
	public void checkDayAndMonth() throws InvalidDayException, InvalidMonthException {

		MyDate d = new MyDate(31, 2, 2012);
		d.checkDayMonth();

	}

	@Test(expected = InvalidDayException.class)
	public void checkDayAndMonth1() throws InvalidDayException, InvalidMonthException {

		MyDate d = new MyDate(32, 6, 2012);
		d.checkDayMonth();

	}

	@Test(expected = InvalidDayException.class)
	public void checkDayAndMonth2() throws InvalidDayException, InvalidMonthException {

		MyDate d = new MyDate(31, 4, 2015);
		d.checkDayMonth();
	}

	@Test(expected = InvalidDayException.class)
	public void checkDayAndMonth3() throws InvalidDayException, InvalidMonthException {

		MyDate d = new MyDate(31, 9, 2015);
		d.checkDayMonth();

	}

	@Test(expected = InvalidDayException.class)
	public void checkDayAndMonth4() throws InvalidDayException, InvalidMonthException {

		MyDate d = new MyDate(29, 2, 2019);
		d.checkDayMonth();

	}

}