package day01;

public class Variable {
	public static void main(String[] args) {

		// 숫자
		byte by = 1; // 1byte = 8bit = 2^8
		short sh = 2; // 2
		int in = 4; // 4
		long lo = 8; // 8
		float fl = 4; // 4
		double dou = 8.8; // 8

		in = in + 2;
		dou = dou + 0.2;

		System.out.println(by);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(lo);
		System.out.println(fl);
		System.out.println(dou);

		// 문자 2byte
		char ch = 'a';
		System.out.println(ch);

		// 논리형 1byte
		boolean bool = true;
		System.out.println(bool);
	}
}