import java.util.Scanner;

public class MarksOfSubjects {

	public static void main(String[] args) {

		int marks1, marks2, marks3;
		System.out.println("Enter marks for 3 subjects-");
		Scanner s = new Scanner(System.in);
		marks1 = s.nextInt();
		marks2 = s.nextInt();
		marks3 = s.nextInt();
		s.close();

		if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
			System.out.println("Passed");
		} else if ((marks1 > 60 && marks2 > 60) || (marks1 > 60 && marks3 > 60) || (marks2 > 60 && marks3 > 60)) {
			System.out.println("Promoted");
		} else if ((marks1 > 60 || marks2 > 60 || marks3 > 60) || (marks1 < 60 && marks2 < 60 && marks3 < 60)) {
			System.out.println("Failed");
		}
	}

}
