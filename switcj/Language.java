package Controlflow.switcj;

public class Language {
//	Language Selection
//
//	Write a Java program using switch case to display greeting message.
//
//	Example:
//	1 â†’ English â†’ Hello
//	2 â†’ Hindi â†’ Namaste
//	3 â†’ Marathi â†’ Namaskar

	public static void main(String[] args) {

		int lang = 3;

		switch (lang) {
		case 1:
			System.out.println("Hello");
			break;

		case 2:
			System.out.println("Namaste");
			break;

		case 3:
			System.out.println("Namaskar");
			break;

		default:
			System.out.println("Invalid Language");
		}
	}
}
