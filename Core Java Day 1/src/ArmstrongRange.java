
import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {

		int number, temp, r, sum = 0;
		System.out.println("Armstrong numbers between 100-999 are-");

		for (int i = 100; i <= 999; i++) {
			sum = 0;
			temp = i;

			while (temp != 0) {

				r = temp % 10;
				sum = sum + r * r * r;
				temp = temp / 10;
			}

			if (i == sum) {
				System.out.println(i);
			}
		}
	}

}
