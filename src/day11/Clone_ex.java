package day11;

public class Clone_ex {// ¾èÀºº¹»ç
	public static void main(String args[]) {
		Member2 original = new Member2("hong", "1234");
		Member2 cloned = original.getMember2();

		cloned.pw = "123456789";

		System.out.println(original.id + original.pw);
		System.out.println(cloned.id + cloned.pw);
	}
}

class Member2 implements Cloneable {
	String id;
	String pw;

	Member2(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public Member2 getMember2() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}