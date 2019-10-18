package day11;

public class Class_ex {

	public static void main(String[] args) {
		Car car = new Car();

		try {
			Class car2 = car.getClass();
			
			System.out.println(car2.getName());
			System.out.println(car2.getPackage());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Car {
	Car() {
		System.out.println("Car() »ý¼ºÀÚ");
	}
}