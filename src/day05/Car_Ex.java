package day05;

public class Car_Ex {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.accel();
		System.out.println(c1.cSpeed);
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		c1.accel();
		System.out.println(c1.cSpeed);
		c1.stop();
		System.out.println(c1.cSpeed);
	}
}
