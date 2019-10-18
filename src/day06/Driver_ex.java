package day06;

public class Driver_ex {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.driver(new Bus());
		driver.driver(new Taxi());
	}
}
