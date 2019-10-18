package day06;

public class Unit_ex {
	public static void main(String[] args) {
		SCV s1 = new SCV();
		SCV s2 = new SCV();
		
		System.out.println(s1.hp);
		System.out.println(s2.hp);
		s1.attack(s1);
		
		System.out.println(s1.hp);
		System.out.println(s2.hp);
		s1.fix(s1);
		
		System.out.println(s1.hp);
		System.out.println(s2.hp);
		s1.stop();
		s1.move(5, 6);
		s1.mine(10, 8);
	}
}
