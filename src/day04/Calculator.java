package day04;

public class Calculator {
	
	Calculator() {
		System.out.println("계산기가 만들어졌습니다.");
	}

	int add(int a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		return a / b;
	}
}
