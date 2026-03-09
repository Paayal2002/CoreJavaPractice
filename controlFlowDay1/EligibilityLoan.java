package controlFlowDay1;

public class EligibilityLoan {
//Write a program to check whether a person is eligible for a loan.
//	Conditions :
//		Age ≥ 21
//		Salary ≥ 25000
	
	
	public static void main(String args[]) {
		int age =25;
		double salary=40000;
		
		if(age>=21) {
			System.out.println("Your 1st stage of loan is cleared");
			if(salary==40000) {
				System.out.println("Your 2nd stage also cleared....Congratulation you are eligible for loan.");
			}else {
				System.out.println("Your salary is not enough for loan");
			}
		}else {
			System.out.println("sorry!");
		}
	}
}
