package day07;

public abstract class Phone {//추상클래스
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("Phone 전원: ON");
	}

	public void turnOff() {
		System.out.println("Phone 전원: OFF");
	}

	// 추상 메소드: 선언만 하고, 구현은 자식클래스에서 정의
	public abstract void sound();
}
