package day02;

public class PrimeNum {
	public static void main(String[] args) {
		// 1~100까지 소수 출력

		for (int j = 1; j <= 100; j++) {

			int sosu = j;
			int cnt = 0;

			for (int i = 1; i <= sosu; i++) {
				if (sosu % i == 0) {
					cnt++;
				}
			}
			
			if (cnt == 2) {
				System.out.println(sosu);
			}

		
		}

	}
}
