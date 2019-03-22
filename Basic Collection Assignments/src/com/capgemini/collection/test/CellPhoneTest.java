package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.CellPhone;

public class CellPhoneTest {

	private static CellPhone nokia;
	private static CellPhone samsung;
	private static CellPhone mi;


	@BeforeClass
	public static void setUp() {
		nokia = new CellPhone("Nokia", "Lumia 635", "1.2 GHz Quad Core ", " Windows Phone 8.1", 7000);
		samsung = new CellPhone("Samsung", "Galaxy A30", "64 GB", "Android", 16990);
		mi = new CellPhone("Nokia", "Lumia 635", "128GB Storage", " Windows Phone 8.1", 12000);
		
	}

	@Test
	public void testUsingArrayList() {
		ArrayList<CellPhone> cellphone = new ArrayList<>();
		cellphone.add(nokia);
		cellphone.add(samsung);
		cellphone.add(mi);

		Iterator<CellPhone> it = cellphone.iterator();
		assertEquals(nokia, it.next());
		assertEquals(samsung, it.next());

	}

	@Test
	public void testUsingHashset() {
		HashSet<CellPhone> cellphone = new HashSet<>();
		cellphone.add(nokia);
		cellphone.add(samsung);
		cellphone.add(mi);

		assertEquals(2, cellphone.size());

	}

}
