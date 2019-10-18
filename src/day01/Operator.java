package day01;

public class Operator {
	public static void main(String[] args) {

		int a = 1;
		System.out.println(a);
		a = 10;
		a *= 2;
		a *= a;
		System.out.println(a);

		int b = 1;
		b = b + 1;
		System.out.println(b);
		b += 1;
		System.out.println(b);
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);

		// 365
		int p100; // 3
		int p10; // 6
		int p1; // 5

		p100 = 365 / 100;
		System.out.println("p100=" + p100);

		p10 = (365 % 100) / 10; // p10=(365-(p100*100))/10
		System.out.println("p10=" + p10);

		p1 = 365 % 10;
		System.out.println("p1=" + p1);

		// 현재온도 20C => F 변환
		double tf;
		double tc = 20;
		// tf = 1.8*tc + 32;
		// tf=((double)180/100)*tc+32;
		tf = (tc * (18000 / 100) / 100) + 32;
		System.out.println(tf);

	}
}
