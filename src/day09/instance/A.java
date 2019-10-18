package day09.instance;

public class A {
	A() {
		System.out.println("A() 객체생성");
	}

	// 필드
	int a;
	static int staticA;

//	A classA = new A();
	B classB = new B();
	C classC = new C();
//	D classD = new D(); 로컬클래스는 ERROR!

	static A staticClassA = new A();
//	static B staticClassB = new B();
	static C staticClassC = new C();
//	static D staticClassD = new D();

	void methodA() {
		a = 10;
		staticA = 20;

//s		classA.a = 30;
		classB.b = 40;
		classC.c = 50;

		staticClassA.a = 60;
		staticClassC.c = 70;

		B classBB = new B();
		C classCC = new C();

	}

	static void methodB() {
//		a=10;
		staticA = 20;

		staticClassA.a = 110;
		staticClassC.c = 120;

//		B classBB = new B();
		C classCCC = new C();
		classCCC.c = 150;
	}

// 인스턴스 클래스(멤버)
	class B {
		B() {
			System.out.println("A.B() 객체생성");
		}

		int b;

		void methodB() {
		}
//		static int staticB;
//		static void methodstaticB() {}
	}

// 정적 클래스(멤버)
	static class C {
		C() {
			System.out.println("A.C() 객체생성");
		}

		int c;

		void methodC() {
		}

		static int staticC;

		static void methodstaticC() {
		}

	}

	// 로컬 클래스
	void method() {
		class D {
			D() {
				System.out.println("A.method().D() 객체생성");
			}

			int d;

			void methodD() {
			}
//			static int staticD;
//			static void methodstaticD() {}
		}

		D d = new D();
		d.d = 6;
		d.methodD();
		System.out.println(d.d);
	}
}
