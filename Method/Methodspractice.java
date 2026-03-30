package Method;


	public class Methodspractice {

	    // 1. Print name (no return, no parameter)
	    void printName() {
	        System.out.println("Payal Yamsanwar");
	    }

	    // 2. Add two numbers
	    int add(int a, int b) {
	        return a + b;
	    }

	    // 3. Check even or odd
	    void checkEvenOdd(int num) {
	        if(num % 2 == 0)
	            System.out.println(num + " is Even");
	        else
	            System.out.println(num + " is Odd");
	    }

	    // 4. Find square of number
	    int square(int num) {
	        return num * num;
	    }

	    // 5. Return largest of two numbers
	    int largest(int a, int b) {
	        if(a > b)
	            return a;
	        else
	            return b;
	    }

	   

	        
	    
	}

