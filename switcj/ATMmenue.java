package Controlflow.switcj;

public class ATMmenue {

	public static void main(String[] args) {

		int choice = 1;

		switch (choice) {
		case 1:
			System.out.println("Check Balance");
			break;

		case 2:
			System.out.println("Withdraw Money");
			break;

		case 3:
			System.out.println("Deposit Money");
			break;

		case 4:
			System.out.println("Exit");
			break;

		default:
			System.out.println("Invalid Option");
		}
	}
}
