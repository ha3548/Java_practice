package day01;

public class PromotionEx {
	public static void main(String[] args) {

		// 정수형
		int a = 10;
		int b = 20;
		// 실수형
		double douA = 20;
		double douB = 0;

		douB = douA + (double) a; // 20.0 + 10.0

		System.out.println(douB);

		b = (int) douB;
		System.out.println(b);

		System.out.println(Byte.MAX_VALUE); // 최대값 127
		System.out.println(Byte.MIN_VALUE); // 최소값 -128
	}
} // 강제 타입 변환은 되도록 쓰지말자!
