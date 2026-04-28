package array;

public class Dublicates {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 6, 1 } };

		System.out.println("Duplicate elements are:");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				for (int k = i; k < arr.length; k++) {
					for (int l = (k == i ? j + 1 : 0); l < arr[k].length; l++) {

						if (arr[i][j] == arr[k][l]) {
							System.out.println(arr[i][j]);
						}

					}
				}

			}
		}
	}
}
