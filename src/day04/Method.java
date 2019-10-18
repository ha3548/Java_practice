package day04;

public class Method {
	public static int add(int addA, int addB) {
		int result;
		result = addA + addB;

		return result;
	}

	public static void main(String[] args) {
		int a, b;
		int result, result2;

		a = 10;
		b = 20;
		result = a + b;
		result2 = add(a, b);
		System.out.println(result);
		System.out.println(result2);// 메소드 사용

	}

}
