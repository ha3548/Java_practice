package day09.instance;

import day09.instance.A.C;

public class Main {
	public static void main(String args[]) {
		C c = new A.C();// 바로접근 가능
		c.c = 4;
		c.methodC();
		System.out.println(c.c);
		c.staticC = 5;
		c.methodstaticC();

		A a = new A();// 선행
		A.B b = a.new B();// 후행
		b.b = 3;
		b.methodB();
		System.out.println(b.b);


		a.method();
//		System.out.println(d.d);
	}
}
