package day06_Ex;

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea();

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x, y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape {
	double r;

	Circle(int r) {
		setRadius(r);
	}

	Circle(double r) {
		setRadius(r);
	}

	void setRadius(double r) {
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	double width, height;

	public Rectangle(int w, int h) {
		setWidth(w);
		setHeight(h);
	}

	void setWidth(double width) {
		this.width = width;
	}

	void setHeight(double height) {
		this.height = height;
	}

	boolean isSquare() {
		if (width == height)
			return true;
		else
			return false;
	}

	@Override
	double calcArea() {
		return width * height;
	}
}

public class Exercise_5_6 {
	static double sumArea(Shape[] arr) {
		double result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i].calcArea();
		}
		return result;
	}

	public static void main(String[] args) {
		/*
		 * Circle c = new Circle(); Rectangle r = new Rectangle();
		 * 
		 * c.setRadius(5); System.out.println(c.calcArea());
		 * 
		 * r.setHeight(10); r.setWidth(15); System.out.println(r.isSquare());
		 * r.setWidth(10); System.out.println(r.isSquare());
		 */

		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합: " + sumArea(arr));
	}

}
