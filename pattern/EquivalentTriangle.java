package com.pattern;

public class EquivalentTriangle {
	public static void main(String args[]) {

		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= 5 - i; j++) { // space
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) { // Column
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}
