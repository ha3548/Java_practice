package day10;

public class Cal_ex {

}

class Cal {
	int plus(int x, int y) {
		return x + y;
	}

	double plus(double x, double y) {
		return x + y;
	}

	double plus(double x, int y) {
		return x + y;
	}
}// 이렇게 다양한타입을 일일이 정의해줘야하는 불편함 -> 제네릭!!