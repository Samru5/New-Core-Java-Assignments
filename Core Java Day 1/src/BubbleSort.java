
public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int s = arr.length;
		System.out.println("Before bubble sort-");

		for (int i = 0; i < s; i++) {
			System.out.print("  " + arr[i]);
		}

		for (int m = 0; m < s; m++) {

			for (int n = 1; n < s - m; n++) {

				if (arr[n - 1] > arr[n]) {
					temp = arr[n - 1];
					arr[n - 1] = arr[n];
					arr[n] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After bubble sort-");

		for (int i = 0; i < s; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
