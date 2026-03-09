package controlFlowDay1;

public class CheckUpperCase {
	public static void main (String args[]) {
		char charector= 'M';
		
		if(charector > 'A' && charector < 'Z') {
			System.out.println("the  " +charector+ " is in a Uppercase Charector" );
		}else {
			System.out.println("the  " +charector+ " is in a Lowercase Charector" );
		}
	}

}
