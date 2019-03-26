package com.capgemini.files.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.FileExistApplication;
import com.capgemini.files.client.FileLineCountApplication;

public class FileLineCountApplicationTest {

	@Test
	public void checkFileExistsOrNot() {
		FileLineCountApplication file = new FileLineCountApplication();
		assertTrue(file.checkFileExistsOrNot());

	}

	@Test
	public void checkFileEmptyOrNot() {
		FileLineCountApplication file = new FileLineCountApplication();
		assertTrue(file.checkFileEmptyOrNot());

	}

	@Test
	public void countNumberOfLines() throws IOException {
		FileLineCountApplication file = new FileLineCountApplication();
		assertEquals(67, file.countLines());
	}

}
