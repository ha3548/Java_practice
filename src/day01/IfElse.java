package day01;

public class IfElse {
	public static void main(String[] args) {

		int a = 11;
		// 조건문
		if (a == 10) {
			// 참
			System.out.println("a는 10입니다.");
		} else {
			// 거짓
			System.out.println("a는 10이 아닙니다.");
		}

		int b = 21;
		if (b % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		if (b % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}
}