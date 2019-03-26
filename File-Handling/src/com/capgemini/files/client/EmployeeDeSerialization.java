package com.capgemini.files.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import com.capgemini.files.model.Employee;

public class EmployeeDeSerialization {
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

	public Object doDeSerialization(String filePath) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		Object object = inputStream.readObject();
		inputStream.close();
		System.out.println(object);
		System.out.println("Reading object from file successfully!");
		return object;
	}

}
