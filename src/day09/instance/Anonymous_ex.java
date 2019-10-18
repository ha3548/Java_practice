package day09.instance;

interface Vehicle {
	public void run();
}

class Anonymous {
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};

	void method1() {
		Vehicle localVal = new Vehicle() {
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVal.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}

public class Anonymous_ex {
	public static void main(String args[]) {
		Anonymous a = new Anonymous();
		a.field.run();// 익명객체 필드
		a.method1();// 익명객체 로컬변수
		a.method2(new Vehicle() {// 익명객체 매개값
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
}
