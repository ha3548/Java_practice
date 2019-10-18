package day01;

public class Lotto {
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, n6;
		n1 = (int) (Math.random() * 44) + 1;
		n2 = (int) (Math.random() * 44) + 1;
		n3 = (int) (Math.random() * 44) + 1;
		n4 = (int) (Math.random() * 44) + 1;
		n5 = (int) (Math.random() * 44) + 1;
		n6 = (int) (Math.random() * 44) + 1;

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
	}
}
