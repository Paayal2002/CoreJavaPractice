package Controlflow.switcj;

public class Seasons {

	public static void main(String[] args) {

		int month = 7;

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Summer");
			break;

		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Monsoon");
			break;

		case 10:
		case 11:
			System.out.println("Autumn");
			break;

		default:
			System.out.println("Invalid Month");
		}
	}
}
