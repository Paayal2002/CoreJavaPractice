package Encapsulaton;

public class main {
	public static void main(String[] args) {

		Person p = new Person();

		p.setName("Payal");
		p.setage(24);

		// Use getter methods to print
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getage());

		 BankAccount acc = new BankAccount();

	        acc.deposit(5000.0);   // deposit money
	        acc.withdraw(2000.0);  // withdraw money

	        System.out.println("Current Balance: " + acc.getBalance());
}
}