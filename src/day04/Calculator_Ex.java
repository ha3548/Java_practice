package day04;

public class Calculator_Ex {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10, 20));
		System.out.println(cal.minus(10, 20));
		System.out.println(cal.mul(10, 20));
		System.out.println(cal.div(20, 10));
	}
}
