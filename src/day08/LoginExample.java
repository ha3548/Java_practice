package day08;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("blue")) // NotExistIDException
			throw new NotExistIDException("아이디가 존재하지 않습니다.");

		if (!password.equals("12345")) // WrongPasswordException
			throw new WrongPasswordException("패스워드가 틀립니다.");

	}
}

class NotExistIDException extends Exception {
	public NotExistIDException() {
	}

	public NotExistIDException(String message) {
		super(message);
	}

}

class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}

	public WrongPasswordException(String message) {
		super(message);
	}
}