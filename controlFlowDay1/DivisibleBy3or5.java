package controlFlowDay1;

public class DivisibleBy3or5 {
	//Write a program to check whether a number is divisible by both 3 and 5.
	
	public static void main(String args[]) {
		int num=15;
		
		if(num % 3==0 && num % 5==0) {
			System.out.println(num +" is diviseble by 3 and 5.");
		}else {
			System.out.println(num +" is not diviseble by 3 and 5.");
		}
	}

}
