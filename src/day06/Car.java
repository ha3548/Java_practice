package day06;

public class Car {
	String master, model = "Sonata", color;
	int speed, cc, maxSpeed;

	// OverLoading
	Car() {
		System.out.println("Car()");
	}

	Car(String master) {
		System.out.println("Car(String master)");
		this.master = master;
		this.cc = 2000;
		this.maxSpeed = 200;
	}

	Car(String master, int cc) {
		this(master);
		this.cc = cc;
		this.speedCheck();
	}
	
	int speedCheck() {
		return speed;
	}
}
