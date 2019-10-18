package day01_Ex;

public class Exercise9 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;

		System.out.println("ch:" + ch);
		System.out.println("ch to loweCase:" + lowerCase);
	}
}
