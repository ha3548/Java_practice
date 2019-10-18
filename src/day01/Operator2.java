package day01;

public class Operator2 {
	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);

		int b = 10;
		b--;
		System.out.println(b);
		--b;
		System.out.println(b + "\n");

		// 11 12 9 8

		int aa = 10;
		System.out.println(aa++);
		System.out.println(++aa);

		int bb = 10;
		System.out.println(bb--);
		System.out.println(--bb + "\n");

		// 10 12 10 8

		int c = 10;
		++c;// 11
		c--;// 10
		--c;// 9
		--c;// 8
		c++;// 9

		System.out.println(c);// 9
		System.out.println(++c);// 10

		c = 0;
		a = 5;
		b = 7;
		c = ++a + b++;
		System.out.println(a);// 6
		System.out.println(b);// 8
		System.out.println(c + "\n");// 6+7=13

		// boolean
		boolean bool = false;
		System.out.println(bool);
		System.out.println(!bool);

		boolean b1 = 100 > 20;// T
		boolean b2 = 100 < 20;// F
		int d = 20;
		int e = 30;
		boolean b3 = d >= e;// F
		boolean b4 = d <= e;// T
		boolean b5 = d != e;// T
		boolean b6 = d == e;// F
		System.out.println("\n" + b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6 + "\n");

		// 논리연산자 &&(and) ||(or) !(not) ^(nor)
		// (논리식) ? 참:거짓
		int f;
		int g = 2;
		f = (20 == g * 10) ? 100 : 200;
		System.out.println(f);
	}
}
