package BreakContinue;

public class Ending5 {


	public static void main(String args[]) {
		
		//Print numbers from 1 to 100 but skip numbers ending with digit 5.
		
		for(int i=1; i<=100; i++) {
			if(i % 5 ==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	
}




