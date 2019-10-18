package day05;

public class Asurada_Ex {
	public static void main(String[] args) {
		Asurada mycar = new Asurada("Bong");
		mycar.mode = "D";
		mycar.accel();
		System.out.println(mycar.cSpeed);
		mycar.mode="B";
		mycar.booster();
	}
}
