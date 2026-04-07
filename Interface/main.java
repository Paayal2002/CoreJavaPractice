package Interface;

public class main {
	 public static void main (String args[]) {

	        // 1. Calculator
	        Calculator calc = new SimpleCalculator();
	        calc.add(10, 5);
	        calc.subtract(10, 5);
	        calc.multiply(10, 5);
	        calc.divide(10, 5);

	        System.out.println("------------------");
	        
	        // 2. Shape
	        Shape s1 = new Circle();
	        s1.area();
	        s1.perimeter();

	        Shape s2 = new Rectangle();
	        s2.area();
	        s2.perimeter();

	        System.out.println("-----------");

	        // 3. Vehicle
	        Vehicle v1 = new Car();
	        v1.start();
	        v1.stop();

	        Vehicle v2 = new Bike();
	        v2.start();
	        v2.stop();

	        System.out.println("-----------");
	        
	     // 4. Employee
	        Employee emp1 = new FullTimeEmployee();
	        emp1.calculateSalary();

	        Employee emp2 = new PartTimeEmployee();
	        emp2.calculateSalary();

	        System.out.println("------------------");
	        
	        // 5. Printer
	        Printer p1 = new InkjetPrinter();
	        p1.print();

	        Printer p2 = new LaserPrinter();
	        p2.print();

	        System.out.println("------------------");
	        
	     // 6. Payment
	        Payment pay1 = new UPI();
	        pay1.pay(500);

	        Payment pay2 = new CreditCard();
	        pay2.pay(1000);

	       
	        System.out.println("------------------");


	}

}
