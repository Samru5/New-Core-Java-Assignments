package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.files.client.MyClass;

public class MyClassTest {
	ArrayList<MyClass> a;
	MyClass m1;
	MyClass m2;
	MyClass m3;
	MyClass m4;
	MyClass m5;

	@Before
	public void setUp() {

		m1 = new MyClass(1, "Java");
		m2 = new MyClass(2, "SAP");
		m3 = new MyClass(3, ".NET");
		m4 = new MyClass(4, "SQL");
		m5 = new MyClass(5, "HTML");

		a = new ArrayList<>();

		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		a.add(m5);
	}

	@Test
	public void doSerialization() throws IOException {
		MyClass s = new MyClass();

		assertTrue(s.doSerialization("myclass.ser", a));

	}

	@Test
	public void doDeSerialization() throws IOException, ClassNotFoundException {
		MyClass p = new MyClass();
		ArrayList<MyClass> ar = (ArrayList<MyClass>) p.doDeSerialization("myclass.ser");

		Iterator iterator = ar.iterator();

		assertEquals(m1, iterator.next());
		assertEquals(m2, iterator.next());
		assertEquals(m3, iterator.next());
		assertEquals(m4, iterator.next());
		assertEquals(m5, iterator.next());

	}
}
