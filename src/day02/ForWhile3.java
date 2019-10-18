package day02;

public class ForWhile3 {
	public static void main(String[] args) {
		//1~100까지 출력하는데, 10개마다 줄바꿈
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");

			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
}
