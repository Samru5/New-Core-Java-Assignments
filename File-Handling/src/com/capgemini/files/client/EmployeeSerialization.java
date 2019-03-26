package com.capgemini.files.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.capgemini.files.model.Employee;

public class EmployeeSerialization {

	public boolean checkFileExistsOrNot() {

		File file = new File("employee.ser");
		System.out.println(file.exists());
		return true;

	}

	public boolean checkFileEmptyOrNot() {
		File file = new File("employee.ser");
		if (file.length() == 0) {
			System.out.println("File is empty");
			return false;
		} else {
			System.out.println("File is not empty");
		}
		return true;
	}

	public boolean doSerialization(String filePath, Employee e) throws IOException {

		FileOutputStream fileoutputStream = new FileOutputStream(filePath);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileoutputStream);
		outputStream.writeObject(e);
		outputStream.close();
		System.out.println(e);
		System.out.println("Writing  object into file successfully!");

		return true;

	}

}
