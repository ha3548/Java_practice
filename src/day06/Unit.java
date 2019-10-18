package day06;

public class Unit {
	int hp = 30, x, y;

	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("좌표 (" + x + "," + y + ")로 이동합니다.");
	}

	void stop() {
		System.out.println("STOP!");
	}
}

class SCV extends Unit {

	void mine(int x, int y) {
		System.out.println("좌표 (" + x + "," + y + ")로 이동하여 자원을 채취합니다.");
	}

	void attack(SCV scv) {
		System.out.println("ATTACK!");
		if (scv.hp > 10)
			scv.hp -= 10;
		else
			scv.hp = 0;
	}

	void fix(SCV scv) {
		System.out.println("회복중...");
		if (scv.hp <= 25)
			scv.hp += 5;
		else {
			scv.hp = 30;
			System.out.println("HP FULL!");
		}
	}

	// OverRide: (상속관계) 하위클래스에서 메소드 재정의
	void stop() {
		System.out.println("SCV STOP!");
	}
}
