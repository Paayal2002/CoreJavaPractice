package controlFlowDay1;

public class Check {
//	Write a program to check whether a character is vowel, consonant, digit, or special character.

	public static void main(String[] args) {

		char ch = 'A';

		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {

				System.out.println("It is a Vowel");

			} else {
				System.out.println("It is a Consonant");
			}

		} else if (ch >= '0' && ch <= '9') {
			System.out.println("It is a Digit");
		} else {
			System.out.println("It is a Special Character");
		}
	}
}
