package Interface;

public class Circle implements Shape{
	double r = 5;

    public void area() {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * r));
    }

}
