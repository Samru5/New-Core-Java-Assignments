package com.capgemini.files.client;

import java.io.File;

import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("test.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("File is created successfully");
		}

		File newDir = new File("myDir");
		if (!newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is created");
		}

		File file1 = new File(newDir, "myFile.txt");
		if (!file1.exists()) {
			file1.createNewFile();
			System.out.println("File successfully created");
		}

	}

}
