/*Create an abstract class GeometricShape with abstract methods like area() and perimeter(). 
Then, create concrete subclasses like Circle, Rectangle, and Triangle 
that inherit from GeometricShape and implement the required methods. */
package Assignment_02;

import java.util.Scanner;

abstract class GeomatricSahpe {
	abstract public void area();

	abstract public void perimeter();

}

class circle extends GeomatricSahpe {
	static final double PI = 3.142;
	private double rad;
	private double area;
	private double peri;
	Scanner in = new Scanner(System.in);

	public void area() {
		System.out.println("Enter Radius: ");
		rad = in.nextInt();
		area = PI * rad * rad;
		System.out.println("Area of circle : " + area);
	}

	public void perimeter() {
		peri = 2 * PI * rad;
		System.out.println("Perimeter of Circle : " + peri);
	}
}

class Rectangle extends GeomatricSahpe {
	private double len;
	private double br;
	private double area;
	private double peri;
	Scanner in = new Scanner(System.in);

	public void area() {
		System.out.println("Enter Rectangle  Length: ");
		len = in.nextInt();
		System.out.println("Enter Reactangle Breadth: ");
		br = in.nextInt();
		area = len * br;
		System.out.println("Area of Rectangle: " + area);
	}

	public void perimeter() {
		peri = 2 * (len + br);
		System.out.println("Area of Rectangle: " + peri);
	}
}

class Square extends GeomatricSahpe {

	private double side;
	Scanner in = new Scanner(System.in);

	public void area() {
		System.out.println("Enter side of Square: ");
		side = in.nextInt();
		double area = side * side;
		System.out.println("Area of Square: " + area);
	}

	public void perimeter() {
		double peri = 4 * side;
		System.out.println("Area of Rectangle: " + peri);
	}
}

public class TestGeomatricShape {

	public static void main(String[] args) {

		circle circle = new circle();
		circle.area();
		circle.perimeter();
		System.out.println("------------------------------------");
		Rectangle rectangle = new Rectangle();
		rectangle.area();
		rectangle.perimeter();
		System.out.println("------------------------------------");
		Square square = new Square();
		square.area();
		square.perimeter();
	}
}
//@GRS