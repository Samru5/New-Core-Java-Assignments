package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GrepApplication {

	private double count = 0;
	private double countBuffer = 0;
	private double countLine = 0;
	private String lineNumber = "";
	private String filePath = "C:\\Samruddhi\\B.java";
	private BufferedReader br;
	private String inputSearch = "the";
	private String line = "";

	public GrepApplication() {
		super();
	}

	public GrepApplication(double count, double countBuffer, double countLine, String lineNumber, String filePath,
			BufferedReader br, String inputSearch, String line) {
		super();
		this.count = count;
		this.countBuffer = countBuffer;
		this.countLine = countLine;
		this.lineNumber = lineNumber;
		this.filePath = filePath;
		this.br = br;
		this.inputSearch = inputSearch;
		this.line = line;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public double getCountBuffer() {
		return countBuffer;
	}

	public void setCountBuffer(double countBuffer) {
		this.countBuffer = countBuffer;
	}

	public double getCountLine() {
		return countLine;
	}

	public void setCountLine(double countLine) {
		this.countLine = countLine;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	public String getInputSearch() {
		return inputSearch;
	}

	public void setInputSearch(String inputSearch) {
		this.inputSearch = inputSearch;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	/*
	 * public double doProcess() throws IOException { /*String content; int
	 * lineCount = 0; FileReader reader = new FileReader("C:\\Samruddhi\\B.java");
	 * 
	 * BufferedReader bReader = new BufferedReader(reader); while ((content =
	 * bReader.readLine()) != null) { lineCount++;
	 * 
	 * } return true;
	 */

	// br = new BufferedReader(new FileReader(filePath));

	// while((line = br.readLine()) != null)
	// {
	/*
	 * countLine++; //System.out.println(line); String[] words = line.split(" ");
	 * 
	 * for (String word : words) { if (word.equals(inputSearch)) { count++;
	 * countBuffer++; } }
	 * 
	 * if(countBuffer > 0) { countBuffer = 0; lineNumber += countLine + ","; }
	 * 
	 * } br.close(); System.out.println(count); System.out.println(lineNumber);
	 * return count;
	 */

//}
	/*
	 * public boolean searchForName() throws FileNotFoundException { File file = new
	 * File("C:\\Samruddhi\\B.java"); Scanner kb = new Scanner(System.in); Scanner
	 * input = new Scanner(file); String name=kb.nextLine();
	 * 
	 * //System.out.println("Please enter the name you would like to search for: ");
	 * //String name = kb.nextLine();
	 * 
	 * 
	 * 
	 * while(input.hasNextLine()) { System.out.println(input.next(name)); } return
	 * true;
	 */
	/*
	 * public int grepLineNumber(String file, String word) throws Exception {
	 * BufferedReader buf = new BufferedReader(new InputStreamReader(new
	 * DataInputStream(new FileInputStream(file))));
	 * 
	 * String line; int lineNumber = 0; while ((line = buf.readLine()) != null) {
	 * lineNumber++; if (word.equals(line)) { return lineNumber; } } return -1; }
	 */
	/*
	 * public int show() throws FileNotFoundException {int count=0; File file = new
	 * File("C:\\Samruddhi\\B.java");
	 * 
	 * Scanner scanner = new Scanner(file); while(scanner.hasNextLine()) {
	 * if(scanner.nextLine().contains("System")) { count++;
	 * System.out.println("Number of instances of String: " + count);
	 * 
	 * }
	 * 
	 * } return count;
	 * 
	 * }
	 */

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

	public int findString() throws IOException {

		String stringSearch = "System";

		BufferedReader bf = new BufferedReader(new FileReader("C:\\Samruddhi\\B.java"));

		int linecount = 0;
		String line;

		System.out.println("Searching for " + stringSearch + " in file...");
		int a = 0;
		while ((line = bf.readLine()) != null) {

			int indexfound = line.indexOf(stringSearch);

			if (indexfound > -1) {
				linecount++;
				System.out.println("Word is at position " + indexfound + " on line " + linecount);
				System.out.println(line);

			} else {
				a++;
			}

		}
		if (a > 0 && linecount == 0) {

			System.out.println("error");

		}

		bf.close();

		return 0;
	}
}
