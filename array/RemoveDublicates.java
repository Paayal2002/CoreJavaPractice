package array;

public class RemoveDublicates {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 6, 1 } };

		System.out.println("Unique elements:");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				boolean isDuplicate = false;

				// check previous elements only
				for (int k = 0; k < i; k++) {
					for (int l = 0; l < arr[k].length; l++) {
						if (arr[i][j] == arr[k][l]) {
							isDuplicate = true;
						}
					}
				}

				for (int l = 0; l < j; l++) {
					if (arr[i][j] == arr[i][l]) {
						isDuplicate = true;
					}
				}

				if (!isDuplicate) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

}
