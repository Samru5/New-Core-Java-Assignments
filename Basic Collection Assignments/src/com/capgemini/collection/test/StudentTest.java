package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Student;

public class StudentTest {
	private static Student ravi;
	private static Student sneha;
	private static Student johny;

	@BeforeClass
	public static void setUp() {
		ravi = new Student("Ravi", 10, "Computer");
		sneha = new Student("Sneha", 22, "IT");
		johny = new Student("Johny", 98, "MECH");

	}

	@Test
	public void testUsingArrayList() {
		ArrayList<Student> s = new ArrayList<>();
		s.add(ravi);
		s.add(sneha);
		s.add(johny);

		Iterator<Student> it = s.iterator();
		assertEquals(ravi, it.next());
		assertEquals(sneha, it.next());
		assertEquals(johny, it.next());

	}

	@Test
	public void testUsingTreeSet() {
		TreeSet<Student> t = new TreeSet<>();
		t.add(ravi);
		t.add(sneha);
		t.add(johny);

		Iterator<Student> it = t.iterator();

		assertEquals("Johny", it.next().getName());
		assertEquals("Ravi", it.next().getName());
		assertEquals("Sneha", it.next().getName());

	}

	@Test
	public void testUsingMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(ravi.getName(), "Mango");
		map.put(sneha.getName(), "Orange");
		map.put(johny.getName(), "Apple");

		assertEquals("Mango", map.get(ravi.getName()));
		assertEquals("Orange", map.get(sneha.getName()));
		assertEquals("Apple", map.get(johny.getName()));

		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			assertEquals(true, map.containsKey(ravi.getName()));
			assertEquals(true, map.containsKey(sneha.getName()));
			assertEquals(true, map.containsKey(johny.getName()));
			assertEquals(true, map.containsValue("Mango"));
			assertEquals(true, map.containsValue("Orange"));
			assertEquals(true, map.containsValue("Apple"));

		}
	}

}
