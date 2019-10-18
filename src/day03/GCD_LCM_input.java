package day03;

import java.util.Scanner;

public class GCD_LCM_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		sc.close();

		int min = (x < y) ? x : y;
		int GCD;
		int LCM;

		for (int i = min; i > 0; i--) {
			if (x % i == 0 && y % i == 0) {
				GCD = i;
				System.out.println("최대공약수: " + GCD);

				LCM = x * y / GCD;
				System.out.println("최소공배수: " + LCM);

				break;
			}
		}

	}
}
