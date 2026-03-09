package controlFlowDay1;

public class LargestNumer3 {

//Write a program to find the largest among three numbers.

	public static void main(String[] args) {

		int a = 10;
		int b = 25;
		int c = 15;

		if (a > b) {
			if (a > c) {
				System.out.println("A is the largest number: " + a);
			} else {
				System.out.println("C is the largest number: " + c);
			}
		} else {
			if (b > c) {
				System.out.println("B is the largest number: " + b);
			} else {
				System.out.println("C is the largest number: " + c);
			}

		}
	}
}
