package day08;

public class Throws_ex {
	public static void main(String[] args) {
//		try {
		findClass(); // ClassNotFoundException
//		} catch (Exception e) {
//			System.out.println("Exception 발생");
	}

	public static void findClass() {

		try {
			Class clazz = Class.forName("java.lang.String");
			throw new Exception();

		} catch (Exception e) {
			System.out.println("Exception 발생");
		}

	}

}
