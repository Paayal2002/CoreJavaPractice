package BreakContinue;

public class TableOf9 {
	public static void main(String args[]) {
		//Print table of 9 but stop when product becomes more than 50.


		for (int i = 1; i <= 10; i++) {
			int product = i * 9;

			if(product>50) {
				break;
				}
				System.out.println(product);
			}

		}
	}
