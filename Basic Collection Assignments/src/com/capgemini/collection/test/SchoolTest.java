package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.School;

public class SchoolTest {

	private static School kes;
	private static School dav;
	private static School joseph;

	@BeforeClass
	public static void setUp() {
		kes = new School("KES", "Alibaug", "Raigad", 12);
		dav = new School("DAV", "Pune", "Pune", 10);
		joseph = new School("KES", "Shahapur", "Thane", 5);

	}

	@Test
	public void testUsingArrayList() {
		ArrayList<School> school = new ArrayList<>();
		school.add(kes);
		school.add(dav);
		school.add(joseph);

		Iterator<School> it = school.iterator();
		assertEquals(kes, it.next());
		assertEquals(dav, it.next());
		assertEquals(joseph, it.next());

	}

	@Test
	public void testUsingHashset() {
		HashSet<School> school = new HashSet<>();
		school.add(kes);
		school.add(dav);
		school.add(joseph);

		assertEquals(3, school.size());

	}

	@Test
	public void testUsingTreeSet() {
		TreeSet<School> school = new TreeSet<>();
		school.add(kes);
		school.add(dav);
		school.add(joseph);
		assertEquals(0, kes.getName().compareTo(joseph.getName()));
		Iterator<School> it = school.iterator();
		assertEquals("DAV", it.next().getName());
		assertEquals("KES", it.next().getName());

	}

}
