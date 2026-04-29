package arrayPractice;

public class Copy {

	public static void main(String[] args) {

		int[] original = { 10, 20, 30, 40, 50 };
		int[] copy = new int[original.length];

		// Copy elements
		for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}

		// Print copied array
		System.out.println("Copied array elements:");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
}
