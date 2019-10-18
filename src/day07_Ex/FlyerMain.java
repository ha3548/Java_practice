package day07_Ex;

interface Flyer {
	int fast = 100;
	void fly();
	boolean isAnimal();
}

public class FlyerMain {
	public static void main(String[] args) {
		System.out.println(Flyer.fast);
		System.out.println();
		
		Bird b = new Bird();
		FlyerUtil.show(b);
		System.out.println();
		
		Airplane ap = new Airplane();
		ap.fly();
		FlyerUtil.show(ap);
		System.out.println();
		
		Flyer f = new Bird();
		f.fly();
		System.out.println(f.isAnimal());
		FlyerUtil.show(f);
		System.out.println();
		
		Bird bf = (Bird) f;
		FlyerUtil.show(bf);
	}
}

class Bird implements Flyer{
	public void fly() {
		System.out.println("Bird Flying");
	}

	public boolean isAnimal() {
		return true;
	}
}

class Airplane implements Flyer {
	public void fly() {
		System.out.println("Airplane Flying");
	}

	public boolean isAnimal() {
		return false;
	}
}

class FlyerUtil {
	public static void show(Flyer f) {
		f.fly();
		System.out.println(f.isAnimal());
	}
}