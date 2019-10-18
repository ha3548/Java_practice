package day07;

public class Phone_ex {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone("BONG");
		// Phone p2 = new Phone();
		// 추상클래스는 존재X, 부모클래스의 역할만!
		// Public,Protected(O) <-> Private(X)

		p1.turnOn();
		p1.internetSearch();
		p1.turnOff();
		p1.sound();
	}

}
