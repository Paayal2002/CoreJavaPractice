package Controlflow.switcj;

public class AreaOfShapes {

	public static void main(String[] args) {

		int choice = 1;

		switch (choice) {
		case 1:
			int side = 4;
			System.out.println("Area of Square = " + (side * side));
			break;

		case 2:
			double r = 3;
			System.out.println("Area of Circle = " + (3.14 * r * r));
			break;

		case 3:
			int l = 5, b = 2;
			System.out.println("Area of Rectangle = " + (l * b));
			break;

		default:
			System.out.println("Invalid Shape");
		}
	}
}
