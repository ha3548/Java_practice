package day04;

public class Car {
	String model;
	String master;
	
	int speed = 0;
	int cc;
	int maxSpeed;

	// 생성자
	Car() {
		
	}
	
	// OverLoading: 같은 이름의 함수를 여러개 정의(매개변수 유형·개수 다르게)
	
	Car(String master) {
		this.master = master;
		cc = 2000;
		maxSpeed = 200;
	}

	Car(String master, int cc) {
		this.master = master;
		this.cc = cc;
		this.maxSpeed = 200;
	}

	void run() {
		speed = speed + 10;
	}

	void speedCheck() {
		System.out.println(speed);
	}
}
