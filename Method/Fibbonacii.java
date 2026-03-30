package Method;

public class Fibbonacii {
	
	public void CheckFibbonacii(int num) {
		
		int a=0, b=1;
		
		System.out.println("Fibbonacci series");
		
		for(int i=1; i<=num ; i++) {
			System.out.println(a + "");
			int c= a + b;
			a=b;
			b=c;
		}
	}

}
