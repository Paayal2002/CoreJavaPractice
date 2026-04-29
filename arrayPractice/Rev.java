package arrayPractice;

public class Rev {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int[] rev = new int[arr.length];

		// Reverse array
		for (int i = 0; i < arr.length; i++) {
			rev[i] = arr[arr.length - 1 - i];
		}

		// Print reversed array
		System.out.println("Reversed array:");
		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i] + " ");
		}
	}
}
