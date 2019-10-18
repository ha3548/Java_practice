package day09_Ex;

class Outer {
	class Inner {
		int iv = 100;
	}
}

public class Exercise1 {
	public static void main(String args[]) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		System.out.println(i.iv);
	}
}
