package arrayPractice;

public class Average {
	public static void main(String[] args) {

		int[] arr = { 22, 33, 44, 55, 66 };
		int sum = 0;
		int average = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			average = arr[i] / arr.length;

		}
		System.out.println("Sum of total elements in array : " + sum);
		System.out.println("average  : " + average);

	}

}
