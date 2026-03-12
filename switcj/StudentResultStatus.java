package Controlflow.switcj;

public class StudentResultStatus {
//	 Student Result Status
//
//	 Write a Java program using switch case.
//
//	 Input: Grade letter
//	 A â†’ Distinction
//	 B â†’ First Class
//	 C â†’ Second Class
//	 D â†’ Pass
//	 F â†’ Fail

	public class StudentResult {
		public static void main(String[] args) {

			char grade = 'B';

			switch (grade) {
			case 'A':
				System.out.println("Distinction");
				break;

			case 'B':
				System.out.println("First Class");
				break;

			case 'C':
				System.out.println("Second Class");
				break;

			case 'D':
				System.out.println("Pass");
				break;

			case 'F':
				System.out.println("Fail");
				break;

			default:
				System.out.println("Invalid Grade");
			}
		}
	}
}
