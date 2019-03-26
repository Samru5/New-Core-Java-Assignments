package com.capgemini.files.client;

import java.io.File;

public class FileExistApplication {

	public boolean checkFileExistsOrNot() {
		File file = new File("C:\\Samruddhi\\B.java");
		if (file.exists()) {
			System.out.println("File exists");
			return true;
		} else {
			System.out.println("File does not exists");

		}
		return false;

	}

}
