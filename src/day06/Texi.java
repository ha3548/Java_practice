package day06;

public class Texi extends Car {

	int totalPrice = 0, basicPrice = 3000;
	// 오버라이딩->택시주인
	String master = "PARK";

	Texi() {
		super(); //부모클래스의 생성자 호출
		totalPrice = basicPrice;
	}

	Texi(String master, String model) {
		super.master = master;
		super.model = model;
		// this.master = master; -> 자기자신
	}

	int calPrice(int km) {
		int price = basicPrice + (km * 1000);
		totalPrice = price;
		return price;
	}

	void init_Price() {
		totalPrice = basicPrice;
	}
}
