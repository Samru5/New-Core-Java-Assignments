
import java.util.Scanner;

public class AverageAndSum {

	public static void main(String[] args) {
		int arr[][];
		arr = new int[3][3];
		int student[] = new int[3];

		int avg[] = new int[3];
		int sum = 0;
		float average = 0.0f;

		System.out.println("Enter the marks for 3 subjects of all students ");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				arr[i][j] = s.nextInt();
				

			}
		}

		
		System.out.println();

		System.out.println("Total score for all subjects for each respective student is-");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				student[i] = student[i] + arr[i][j];

			}
			System.out.println(student[i]);
		}

		System.out.println();

		System.out.println(" Average of Marks for all subjects for each respective student is is-");
		for (int i = 0; i < 3; i++) {
			student[i] = 0;
			for (int j = 0; j < 3; j++) {

				student[i] = student[i] + arr[i][j];
				avg[i] = student[i] / 3;

			}
			System.out.println(avg[i]);

		}

		System.out.println();

		System.out.println("Total of marks  for Physics,chemistry,Maths repectively for each student is-");

		for (int j = 0; j < 3; j++) {
			student[j] = 0;
			for (int i = 0; i < 3; i++) {

				student[j] = student[j] + arr[i][j];
			}

			System.out.println(student[j]);
		}

		System.out.println();

		System.out.println("Average of marks for Physics,chemistry,Maths respectively for each student is-");

		for (int j = 0; j < 3; j++) {
			student[j] = 0;
			for (int i = 0; i < 3; i++) {

				student[j] = student[j] + arr[i][j];
				avg[j] = student[j] / 3;
			}

			System.out.println(avg[j]);
		}
		s.close();
		System.out.println();

	}
}
