package day02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();

		System.out.println(">>" + inputString);
		scanner.close();
	}
	
}
