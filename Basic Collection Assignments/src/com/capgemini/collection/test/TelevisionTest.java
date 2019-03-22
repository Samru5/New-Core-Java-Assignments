package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Television;

public class TelevisionTest {

	private static Television samsung;
	private static Television lg;
	private static Television sony;

	@BeforeClass
	public static void setUp() {
		samsung = new Television("SAMSUNG", "LCD", true, 40000);
		lg = new Television("LG", "LED", false, 32000);
		sony = new Television("SONY", "LED", true, 45000);

	}

	@Test
	public void testUsingArrayList() {
		ArrayList<Television> television = new ArrayList<>();
		television.add(samsung);
		television.add(lg);
		television.add(sony);

		Iterator<Television> it = television.iterator();
		//assertEquals(samsung.getCompany(), it.next().getCompany());
		//assertEquals(lg.getCompany(), it.next().getCompany());
		assertEquals(samsung, it.next());
		assertEquals(lg, it.next());
		assertEquals(sony, it.next());


	}

	@Test
	public void testUsingHashset() {
		HashSet<Television> television = new HashSet<>();
		television.add(samsung);
		television.add(lg);
		television.add(sony);
		

		assertEquals(2, television.size());

	}

}
