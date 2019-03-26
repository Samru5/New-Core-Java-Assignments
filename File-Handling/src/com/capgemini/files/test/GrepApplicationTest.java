package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.capgemini.files.client.GrepApplication;

public class GrepApplicationTest {

	@Test
	public void checkFileExistsOrNot() {
		GrepApplication file = new GrepApplication();
		assertTrue(file.checkFileExistsOrNot());

	}

	@Test
	public void checkFileEmptyOrNot() {
		GrepApplication file = new GrepApplication();
		assertTrue(file.checkFileEmptyOrNot());

	}

	@Test
	public void check() throws Exception {
		GrepApplication g = new GrepApplication();

		assertEquals(0, g.findString());

	}
}
