package day11;

public class System_ex2 {

	public static void main(String[] args) {
		// long time = System.nanoTime();
		long time = System.currentTimeMillis();// 1000millis = 1sec

		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				System.out.println(i);
			} else {
				System.out.println(i-5);
			}
		}
		
		// long time2 = System.nanoTime();
		long time2 = System.currentTimeMillis();

		System.out.println(time2 - time);

	}
}
