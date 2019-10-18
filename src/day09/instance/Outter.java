package day09.instance;

public class Outter {
	String outter = "Outter field";

	void method() {
		System.out.println("Outter.method()");
	}

	void print() {
		System.out.println(this.outter);
		this.method();
	}

	class NestedClass {
		String nested = "nested field";

		void method() {
			System.out.println("NestedClass.method()");
		}

		void print() {
			System.out.println(this.nested);
			this.method();

			System.out.println(Outter.this.outter);
			Outter.this.method();
		}
	}

	public static void main(String args[]) {
		Outter o = new Outter();
		Outter.NestedClass n = o.new NestedClass();

		System.out.println(o.outter);
		o.method();
		o.print();

		System.out.println(n.nested);
		n.method();
		n.print();
	}

}
