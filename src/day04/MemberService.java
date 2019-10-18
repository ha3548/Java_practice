package day04;

public class MemberService {
	String id;
	String password;

	MemberService() {
		id = "hong";
		password = "12345";
	}

	boolean login(String id, String password) {
		boolean result = false;

		if (this.id.equals(id) && this.password.equals(password)) {
			result = true;
		}

		return result;

	}

	void logout(String id) {
		if (this.id.equals(id)) {
			System.out.println("로그아웃 되었습니다.");
		}

	}
}
