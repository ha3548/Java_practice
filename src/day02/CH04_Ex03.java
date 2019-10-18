package day02;

public class CH04_Ex03 {
	public static void main(String[] args) {
		//while문
		int i = 1;
		int sum = 0;

		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}

		//for문
		/*int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}*/

		System.out.println("3의 배수의 합: " + sum);

	}
}
