package Encapsulaton;

class BankAccount {

    // Private variable
    private double balance;

    // Deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}
