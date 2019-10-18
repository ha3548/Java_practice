package day06;

public class Vehicle {
	void run() {
		System.out.println("Vehicle 달립니다.");
	}
}

class Bus extends Vehicle {
	void run() {
		System.out.println("Bus 달립니다.");
	}

	void price() {
		System.out.println("Bus 요금을 받습니다.");
	}
}

class Taxi extends Vehicle {
	void run() {
		System.out.println("Taxi 달립니다.");
	}

	void price() {
		System.out.println("Taxi 요금을 받습니다.");
	}
}