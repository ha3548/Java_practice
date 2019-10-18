package day04;

public class Car_Ex {
	public static void main(String[] args) {
		Car asurada = new Car("Bong");//생성자 호출
		System.out.println(asurada.master);
		System.out.println(asurada.cc);
		System.out.println(asurada.maxSpeed);
		
		Car toyota=new Car("Park", 1000);
		System.out.println(toyota.master);
		System.out.println(toyota.cc);
		System.out.println(toyota.maxSpeed);
		
		asurada.run();
		asurada.speedCheck();
		asurada.run();
		asurada.run();
		asurada.speedCheck();
	}
}
