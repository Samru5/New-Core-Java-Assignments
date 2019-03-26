package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCountApplication {

	public boolean checkFileExistsOrNot() {

		File file = new File("C:\\Samruddhi\\B.java");
		System.out.println(file.exists());
		return true;

	}

	public boolean checkFileEmptyOrNot() {
		File file = new File("C:\\Samruddhi\\B.java");
		if (file.length() == 0) {
			System.out.println("File is empty");
			return false;
		} else {
			System.out.println("File is not empty");
		}
		return true;
	}

	public int countNumberOfWords() throws IOException {
		String content;
		int linecount = 0;
		int countOfWords = 0;

		FileReader reader = new FileReader("C:\\Samruddhi\\B.java");

		BufferedReader bReader = new BufferedReader(reader);
		while ((content = bReader.readLine()) != null) {

			linecount++;
			String[] words = content.split(" ");
			countOfWords = countOfWords + words.length;
		}

		System.out.println(countOfWords);
		return countOfWords;
	}
}
