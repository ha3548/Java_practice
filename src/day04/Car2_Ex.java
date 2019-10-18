package day04;

public class Car2_Ex {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		System.out.println("Company: " + c1.company);
		System.out.println("Model: " + c1.model);
		System.out.println("Color: " + c1.color);
		System.out.println("MaxSpeed: " + c1.maxSpeed);
		System.out.println();
		System.out.println();

		Car2 c2 = new Car2("자가용");
		System.out.println("Company: " + c2.company);
		System.out.println("Model: " + c2.model);
		System.out.println("Color: " + c2.color);
		System.out.println("MaxSpeed: " + c2.maxSpeed);
		System.out.println();

		Car2 c3 = new Car2("회사용", "검정");
		System.out.println("Company: " + c3.company);
		System.out.println("Model: " + c3.model);
		System.out.println("Color: " + c3.color);
		System.out.println("MaxSpeed: " + c3.maxSpeed);
		System.out.println();

		Car2 c4 = new Car2("가족용", "빨강", 200);
		System.out.println("Company: " + c4.company);
		System.out.println("Model: " + c4.model);
		System.out.println("Color: " + c4.color);
		System.out.println("MaxSpeed: " + c4.maxSpeed);
	}
}
