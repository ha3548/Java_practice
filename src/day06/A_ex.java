package day06;

public class A_ex {
	public static void main(String[] args) {
		A a = new A();
		System.out.println();
		B b = new B();
		System.out.println();
		C c = new C();
		System.out.println();
		D d = new D();
		System.out.println();
		E e = new E();
		System.out.println();

		a.methodA();
		a = b; // 다형성 형변환 발생
		a.methodA();
		a = c;
		a.methodA();
		a = d;
		a.methodA();
		a = e;
		a.methodA();

		System.out.println();

		b = d;
		b.methodA();
		b.methodB();

		System.out.println();

		c = e;
		c.methodA();
		c.methodC();

	}
}
