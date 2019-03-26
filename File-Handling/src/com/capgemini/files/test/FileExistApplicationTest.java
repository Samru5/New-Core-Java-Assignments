package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.files.client.FileExistApplication;

public class FileExistApplicationTest {

	@Test
	public void checkFileExistsOrNot() {
		FileExistApplication file = new FileExistApplication();
		assertEquals(true, file.checkFileExistsOrNot());

	}

}
