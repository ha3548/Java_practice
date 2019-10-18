package day02;

public class ForWhile2 {
	public static void main(String[] args) {
		// 1~100 숫자중에 3의배수와 5의배수를 출력, 겹치는 수는 한번만

		for (int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}

			/*if (i % 15 == 0) {

			} else if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
			}*/
			
		}

	}
}
