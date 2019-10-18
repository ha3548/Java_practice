package day07;

public abstract class Unit {
	int x, y;
	public int hp;

	void mone(int x, int y) {
	}

	public abstract void stop();
}

class Marine extends Unit {
	int hp = 100;
	int attacklevel;
	boolean mode;

	Marine() {
		hp = 100;
		attacklevel = 10;
		mode = false;
	}

	void attack(Unit enemy) {
		if (mode == true) {
			enemy.hp -= (attacklevel + 5);
		} else {
			enemy.hp -= (attacklevel);

		}

	}

	void stimPack() {
		mode = true;
		hp -= 10;
	}

	public void stop() {
		System.out.println("Marine STOP");
	}
}

class Tank extends Unit {
	public void stop() {
		System.out.println("Tank STOP");
	}
}

class Dropship extends Unit {
	public void stop() {
		System.out.println("Dropship STOP");
	}
}