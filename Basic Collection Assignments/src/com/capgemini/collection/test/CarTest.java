package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.model.Car;

public class CarTest {
	private static Car suzuki;
	private static Car hondai;
	private static Car tata;

	@BeforeClass
	public static void setUp() {
		suzuki = new Car("Maruti Suzuki", "Swift", 2014, 850000);
		hondai = new Car("Maruti Suzuki", "Creta", 2018, 1200000);
		tata = new Car("Tata", "Nexon", 2018, 1000000);

	}

	@Test
	public void testUsingArrayList() {
		ArrayList<Car> car = new ArrayList<>();
		car.add(suzuki);
		car.add(hondai);
		car.add(tata);

		Iterator<Car> it = car.iterator();
		assertEquals(suzuki, it.next());
		assertEquals(hondai, it.next());
		assertEquals(tata, it.next());

	}

	@Test
	public void testUsingHashset() {
		HashSet<Car> car = new HashSet<>();
		car.add(suzuki);
		car.add(hondai);
		car.add(tata);

		assertEquals(3, car.size());

	}

	@Test
	public void testUsingTreeSet() {
		TreeSet<Car> car = new TreeSet<>();
		car.add(suzuki);
		car.add(hondai);
		car.add(tata);

		Iterator<Car> it = car.iterator();

		assertEquals("Maruti Suzuki", it.next().getMake());
		assertEquals("Tata", it.next().getMake());

	}

}
