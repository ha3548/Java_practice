package day09.instance;

public class NestedA {
	interface I {
		public abstract void method();
	}

	class B implements I {
		public void method() {
			System.out.println("NestedA.B.method()");
		}
	}
}
