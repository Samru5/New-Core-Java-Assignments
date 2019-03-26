package com.capgemini.files.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.FileWordCountApplication;

public class FileWordCountApplicationTest {

	@Test
	public void checkFileExistsOrNot() {
		FileWordCountApplication file = new FileWordCountApplication();
		assertTrue(file.checkFileExistsOrNot());

	}

	@Test
	public void checkFileEmptyOrNot() {
		FileWordCountApplication file = new FileWordCountApplication();
		assertTrue(file.checkFileEmptyOrNot());

	}

	@Test
	public void countNumberOfWords() throws IOException {
		FileWordCountApplication file = new FileWordCountApplication();
		assertEquals(14, file.countNumberOfWords());

	}

}
