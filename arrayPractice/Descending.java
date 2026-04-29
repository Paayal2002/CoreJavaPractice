package arrayPractice;

public class Descending {

	public static void main(String[] args) {

		int[] arr = { 50, 20, 40, 10, 30 };

		// Sorting in descending order
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] < arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// Print sorted array
		System.out.println("Sorted array (Descending):");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
