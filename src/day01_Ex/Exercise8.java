package day01_Ex;

public class Exercise8 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= 1 && ch <= 9));

		System.out.println(b);
	}
}
