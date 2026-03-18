package BreakContinue;

public class Even {
	// Print even numbers from 1 to 100 but stop when you get first odd number.
	
	    public static void main(String[] args) {

	        for(int i = 2; i <= 100; i++) {

	            if(i % 2 != 0) {
	                break;
	            }

	            System.out.println(i);
	        }
	    }
	}

	
	
	 
	
	
	


