package Method;

public class Main {
	public static void main(String[] args) {

		EvenNumbers E = new EvenNumbers();
		E.checkEven(34);
		E.checkEven(55);

		System.out.println("------------------------");

		Fibbonacii F = new Fibbonacii();
		F.CheckFibbonacii(10);

		System.out.println("------------------------");

		Revers R = new Revers();
		R.checkRevers(1234);

		System.out.println("------------------------");

		Palindrome P = new Palindrome();
		P.checkPalindrome(121);
		P.checkPalindrome(123);

		System.out.println("------------------------");

		Methodspractice obj = new Methodspractice();

		obj.printName();

		int sum = obj.add(10, 20);
		System.out.println("Sum = " + sum);

		obj.checkEvenOdd(7);

		int sq = obj.square(5);
		System.out.println("Square = " + sq);

		int max = obj.largest(15, 25);
		System.out.println("Largest = " + max);

		System.out.println("------------------------");

		Star S = new Star();
		S.pattern(5);
		
		System.out.println("------------------------");
		
		Prime N = new Prime();

		N.checkPrime(7); 
		N.checkPrime(10); 
		
		System.out.println("------------------------");
	}

}
