package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLineCountApplication {

	public boolean checkFileExistsOrNot() {
		File file = new File("C:\\Samruddhi\\Country.java");
		System.out.println(file.exists());
		return true;

	}

	public boolean checkFileEmptyOrNot() {
		File file = new File("C:\\Samruddhi\\Country.java");
		if (file.length() == 0) {
			System.out.println("File is empty");
			return false;
		} else {
			System.out.println("File is not empty");
		}
		return true;
	}

	public int countLines() throws IOException {
		String content;
		int lineCount = 0;
		FileReader reader = new FileReader("C:\\Samruddhi\\Country.java");

		BufferedReader bReader = new BufferedReader(reader);
		while ((content = bReader.readLine()) != null) {
			lineCount++;
		}
		System.out.println(lineCount);
		return lineCount;

	}

}
