package controlFlowDay1;

public class CalculateElectricity {

//	Write a program to calculate electricity bill based on units.
//	Example:
//	0–100 → ₹5 per unit
//	101–200 → ₹7 per unit
//	Above 200 → ₹10 per unit
	
	
	    public static void main(String[] args) {

	        int units = 150;   // given units
	        double bill;

	        if (units <= 100) {
	            bill = units * 5;
	        } 
	        else if (units <= 200) {
	            bill = units * 7;
	        } 
	        else {
	            bill = units * 10;
	        }

	        System.out.println("Units = " + units);
	        System.out.println("Electricity Bill = ₹ " + bill);
	    }
	}
	

