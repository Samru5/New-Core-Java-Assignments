package com.capgemini.exception.model;

import com.capgemini.exception.main.InvalidDayException;
import com.capgemini.exception.main.InvalidMonthException;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate() {
		super();

	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void checkDayMonth() throws InvalidMonthException, InvalidDayException {
		if (!(month >= 1 && month <= 12)) {

			throw new InvalidMonthException("InvalidMonthException");
		}

		if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
			if (!(day >= 1 && day <= 29 && month == 2))
				throw new InvalidDayException("InvalidDayException");
		}

		if (day >= 28 && month == 2) {
			throw new InvalidDayException("InvalidDayException");
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

			if (day >= 1 && day <= 31)
				this.day = day;
		} else
			throw new InvalidDayException("InvalidDayException");

		if (month == 4 || month == 6 || month == 9 || month == 11) {

			if (day >= 1 && day <= 30)
				this.day = day;
		} else
			throw new InvalidDayException("InvalidDayException");
	}

}
