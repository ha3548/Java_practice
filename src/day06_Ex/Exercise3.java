package day06_Ex;

public class Exercise3 {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		m.move(2, 3);
		m.stop();
		m.stimPack();
		t.changeMode();
		d.load();
		d.unload();
	}

}

class Unit {
	int x, y;

	void move(int x, int y) {
		System.out.println("좌표 (" + x + "," + y + ")으로 이동");
	}

	void stop() {
		System.out.println("좌표 (" + x + "," + y + ")에서 정지");
	}
}

class Marine extends Unit {
	void stimPack() {
		System.out.println("스팀팩을 사용합니다.");
	}
}

class Tank extends Unit {
	void changeMode() {
		System.out.println("공격모드를 변환합니다.");
	}
}

class Dropship extends Unit {
	void load() {
		System.out.println("선택된 대상을 태웁니다.");
	}

	void unload() {
		System.out.println("선택된 대상을 내립니다.");
	}
}