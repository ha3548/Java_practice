package day09_Ex;

class Outer3 {
	int value = 10;

	class Inner3 {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	}
}

public class Exercise3 {
	public static void main(String args[]) {
		Outer3 o = new Outer3();
		Outer3.Inner3 i = o.new Inner3();
		i.method1();
	}
}
