package controlFlowDay1;

public class GradeSystem {
	
//	Write a program to display grade based on marks.
//	Example condition:
//	Marks ≥ 75 → Distinction
//	Marks ≥ 60 → First Class
//	Marks ≥ 50 → Second Class
//	Marks ≥ 35 → Pass
//	Otherwise → Fail
	
	
	public static void main(String args[]) {
		int Marks =85;
		if(Marks <= 100 && Marks >=75) {
			System.out.println("Distinction");
		}else if(Marks <= 75 && Marks >=60) {
			System.out.println("First Class");
		}else if(Marks <= 60 && Marks >=50) {
			System.out.println("Second Class");
		}else if(Marks <= 50 && Marks >=35) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		  
		
		
	}
	

}
