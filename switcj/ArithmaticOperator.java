package Controlflow.switcj;

public class ArithmaticOperator {

//	 Check Arithmetic Operation Name
//
//	 Write a Java program using switch case to print operation name.
//
//	 Example:
//	 1 â†’ Addition
//	 2 â†’ Subtraction
//	 3 â†’ Multiplication
//	 4 â†’ Division

	public static void main(String[] args) {

		int choice = 2;

		switch (choice) {
		case 1:
			System.out.println("Addition");
			break;

		case 2:
			System.out.println("Subtraction");
			break;

		case 3:
			System.out.println("Multiplication");
			break;

		case 4:
			System.out.println("Division");
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}
}
