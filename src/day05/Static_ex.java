package day05;

public class Static_ex {

	int field1;
	void method1() {

	}

	static int field2;
	static void method2() {

	}

	static {
		// ERROR! 메모리에 존재하지 않고있음.
		//field1 = 10;
		//method1();

		// Static선언으로 메모리에 올라가있음.
		field2 = 20;
		method2();
	}
}
