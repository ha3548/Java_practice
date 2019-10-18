package day04;

public class Member_Ex {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동","hong");
		Member m2 = new Member("강자바","java");
		
		System.out.println(m1.name);
		System.out.println(m1.id);
		System.out.println();
		System.out.println(m2.name);
		System.out.println(m2.id);
	}
}
