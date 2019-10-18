package day06;

public class Airplane {
	public void land() {

	}

	public void fly() {
		System.out.println("일반 비행");
	}

	public void takeoff() {

	}
}

class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flymode = NORMAL;

	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();
		}
	}
}