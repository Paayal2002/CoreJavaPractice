package array;

public class PrimeNumber {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int num : arr) {
			int count = 0;

			if (num <= 1) {
				System.out.println(num + " is Not Prime");
				continue;
			}

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(num + " is Prime");
			} else {
				System.out.println(num + " is Not Prime");
			}
		}
	}
}
