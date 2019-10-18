package day05;

public class Cal {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	// OverLoading: 매개변수 타입,개수가 다른 함수들 ( , )<-괄호안에 있는것
	double add(double a, double b) {
		return a + b;
	}

	double add(double a, double b, double c) {
		return a + b + c;
	}

	// Method OverLoading
	int div(int a, int b) {
		return a / b;
	}

	double div(double a, double b) {
		return a / b;
	}

	Cal() {

	}

	Cal(int a, int b) {

	}

}
