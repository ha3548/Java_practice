package day11_Ex;

public class Exercise04 {

	public static void main(String[] args) {
		Member member = new Member("blue", "ÀÌÆÄ¶õ");
		System.out.println(member);
	}
}

class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return (id + ": " + name);
	}
	
}