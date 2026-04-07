package Interface;

public class Rectangle implements Shape{
	int l = 10, b = 5;

    public void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (l + b)));
    }

}
