package day09.instance;
//p417 4번

class Car {
	class Tire {
	}

	static class Engine {
	}
}

public class NestedClass_ex {
	public static void main(String args[]) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();// 인스턴스클래스: 객체생성필요
		Car.Engine engine = new Car.Engine();// 정적클래스: 바로접근O
	}
}