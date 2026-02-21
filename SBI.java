
public class SBI {
	public static void main(String args[]) {
		System.out.println("Welcome to State Bank Of India");
		System.out.println("-------------------------------");
		
		float TotalAmmount=50000;
		System.out.println("TotalAmount=" +TotalAmmount );
		
		float Withdraw= 5000;
		float RemainingAmount=TotalAmmount -Withdraw;
		
		System.out.println("User wants to withdraw " + Withdraw +  "from SBI Bank" );
		System.out.println( "RemainingAmount=" +  RemainingAmount);
		
		System.out.println("-------------------------------");
		
		float Creadit= 6000;
		
		System.out.println("User wants to debit " + Creadit +  "money from SBI Bank" );
		
		float BankAmount= RemainingAmount + Creadit;
		System.out.println("After creadited the money in the Bank = " + BankAmount);
		
		System.out.println("-------------------------------");
		
		
		
		
		
		
		

		
		
	}

}
