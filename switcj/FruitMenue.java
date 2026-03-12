package Controlflow.switcj;

public class FruitMenue {
//	 Fruit Price Menu
//
//	 Write a Java program using switch case to display price of fruits.
//
//	 Example:
//	 1 â†’ Apple â‚¹100
//	 2 â†’ Mango â‚¹80
//	 3 â†’ Banana â‚¹40
//	 4 â†’ Orange â‚¹60	

	public static void main(String[] args) {

		int fruit = 3;

		switch (fruit) {
		case 1:
			System.out.println("Apple ₹100");
			break;

		case 2:
			System.out.println("Mango ₹80");
			break;

		case 3:
			System.out.println("Banana ₹40");
			break;

		case 4:
			System.out.println("Orange ₹60");
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}
}
