package Controlflow.switcj;

public class Companyrange {

	public static void main(String[] args) {

		int dept = 3;

		switch (dept) {
		case 1:
			System.out.println("HR");
			break;

		case 2:
			System.out.println("Finance");
			break;

		case 3:
			System.out.println("IT");
			break;

		case 4:
			System.out.println("Marketing");
			break;

		default:
			System.out.println("Invalid Department");
		}
	}
}
