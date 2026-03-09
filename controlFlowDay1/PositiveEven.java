package controlFlowDay1;

public class PositiveEven {

	
	//Write a program to check whether a number is positive and even.
	
	
	public static void main(String args[]) {
		int num = 22;
		
		if(num>=0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is not positive");
		} if(num%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is not even");
		}
	}
}
