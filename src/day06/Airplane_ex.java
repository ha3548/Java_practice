package day06;

public class Airplane_ex {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC; // sa.flymode=2;
		sa.fly();
	}
}
