package arrayPractice;

public class Max {
	public static void main(String[] args) {
		int[] arr = { 22, 33, 44, 55, 66 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[0]) {
				max = arr[i];
			}

		}
		System.out.println("Maximum element from array is : " + max);

	}

}
