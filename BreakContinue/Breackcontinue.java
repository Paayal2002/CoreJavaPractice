package BreakContinue;

public class Breackcontinue {
	
	//Print numbers from 1 to 50 but stop when number becomes 25.
	
	
	public static void main(String args[]) {
		
		for(int i=1; i<=50; i++) {
			if(i==25) {
				break;
			}
			System.out.print("   " +i);
		}
	}

}
