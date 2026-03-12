package Controlflow.switcj;

public class ChechNumberrang {

	public static void main(String[] args) {

		int num = 65;
		int range = num / 10;

		switch (range) {
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("Low");
			break;

		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("Medium");
			break;

		case 8:
		case 9:
		case 10:
			System.out.println("High");
			break;

		default:
			System.out.println("Invalid Number");
		}
	}
}
