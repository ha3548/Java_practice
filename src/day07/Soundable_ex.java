package day07;

public class Soundable_ex {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "具克";
	}

}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "港港";
	}

}
