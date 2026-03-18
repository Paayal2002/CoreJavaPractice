package BreakContinue;

public class Skip {
	//Print characters from ‘A’ to ‘Z’ but skip vowels.
	public static void main(String args[]) {
		
	
	
	for( char c='A'; c <='Z' ; c++) {
		if(c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U' ) {
			continue;
		}
		System.out.println(c);
	}
}
}