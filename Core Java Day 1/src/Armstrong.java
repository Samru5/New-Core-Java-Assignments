import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		int number, temp, r, sum = 0;
		System.out.println("Enter a number-");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();

		temp = number;

		while (temp != 0) {
			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}
		s.close();
		if (number == sum) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("It is not an armstrong number");
		}
	}

}
