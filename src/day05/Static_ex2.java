package day05;

public class Static_ex2 {
	static final int A = 10; // 상수, Final필드는 변경X

	public static void main(String[] args) {

		Printer2.println(0);
		System.out.println(Math.PI);
		System.out.println(A);

	}

}

class Printer2 {

	static final int AA = 20;
	int a = 10;
	int b = 20;
	int c = 0;

	static void println(int a) {
		System.out.println(a);
	}

	static void println(boolean a) {
		System.out.println(a);
	}

	static void println(double a) {
		System.out.println(a);
	}

	static void println(String a) {
		System.out.println(a);
	}

}