package arrayPractice;

public class SearchElement {
	public static void main(String[] args) {
		int[] arr = { 22, 33, 44, 55, 66 };

		int Search = 44;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == Search) {
				System.out.println("Element found at index :" + i);
				found = true;
				break;
			} else {
				System.out.println("Not match");
			}
		}

	}
}
