package controlFlowDay1;

public class Leapyear {
	//Write a program to check whether a year is a leap year.
	
	
//	Rule to Check Leap Year
//	A year is a leap year if:
	
//	It is divisible by 4, and
//	Not divisible by 100,
//	Or divisible by 400
	
	
	
	public static void main(String args[]) {
		int year=2024;
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

