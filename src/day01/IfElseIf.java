package day01;

public class IfElseIf {
	public static void main(String[] args) {

		int height = 191;

		if (height > 190) {
			System.out.println("XXL");
		} else if (height > 180) {
			System.out.println("XL");
		} else if (height > 170) {
			System.out.println("L");
		} else {
			System.out.println("M");
		}

		if (height > 170) {
			if (height > 175) {
				System.out.println("장신");
			} else {
				System.out.println("단신");
			}
		}
	}
}
