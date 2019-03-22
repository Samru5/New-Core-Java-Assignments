import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		int number;
		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int s = arr.length;
		System.out.println("given array is-");

		for (int i = 0; i < s; i++) {
			System.out.print("  " + arr[i]);
		}
		System.out.println();
		System.out.println("Enter number to be search in the given array-");
		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();

		for (int i = 0; i < s; i++) {
			if (arr[i] == number) {
				System.out.println("Number found at location " + i);
				break;
			}

		}

	}

}
