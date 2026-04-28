package array;

public class Palindrome {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };

		if (arr[0] == arr[arr.length - 1]) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
