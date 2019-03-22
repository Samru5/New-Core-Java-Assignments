package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Laptop;

public class LaptopTest {
	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	private static Laptop acerLaptop;

	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("Dell", "Inspirion ", "Windows 10", "i3");
		hpLaptop = new Laptop("HP", "Notebook", "Windows 8", "i7");
		acerLaptop = new Laptop("Dell", "Inspiron", "Windows 7", "i3");

	}

	@Test
	public void testUsingArrayList() {
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);

		Iterator<Laptop> it = laptops.iterator();
		assertEquals(dellLaptop, it.next());
		assertEquals(hpLaptop, it.next());
		assertEquals(acerLaptop, it.next());

	}

	@Test
	public void testUsingHashset() {
		HashSet<Laptop> laptops = new HashSet<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);

		assertEquals(3, laptops.size());

	}

}
