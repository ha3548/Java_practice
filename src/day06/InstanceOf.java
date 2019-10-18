package day06;

public class InstanceOf {
	public static void main(String[] args) {
		A a = new B();//자동 형변환
		// A a = new C();

		boolean result = false;
		result = a instanceof B;
		System.out.println(result);

		if (result == true) {
			B b = (B) a;//강제 형변환
			b.methodA();
			b.methodB();
		} else {
			System.out.println("강제 형변환을 할 수 없음!");
		}
	}
}
