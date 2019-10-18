package day04;

public class Car2 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car2() {
		System.out.println("자동차 생성!");
	}

	Car2(String model) {
		this(model, "은색", 250);// this(호출)
	}

	Car2(String model, String color) {
		this(model, color, 250);// this(호출)
	}

	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
