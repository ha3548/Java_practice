package day06;

public class A {
	A() {
		System.out.println("A()");
	}
	
	void methodA() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		System.out.println("B()");
	}
	
	@Override
	void methodA() {
		System.out.println("BA");
	}

	void methodB() {
		System.out.println("B");
	}
}

class C extends A {
	C() {
		System.out.println("C()");
	}
	@Override
	void methodA() {
		System.out.println("CA");
	}
	
	void methodC() {
		System.out.println("C");
	}
}

class D extends B {
	D() {
		System.out.println("D()");
	}
	
	@Override
	void methodA() {
		System.out.println("DBA");
	}
	void methodD() {
		System.out.println("D");
	}
}

class E extends C {
	E() {
		System.out.println("E()");
	}
	
	@Override
	void methodA() {
		System.out.println("ECA");
	}
	
	void methodE() {
		System.out.println("E");
	}
}