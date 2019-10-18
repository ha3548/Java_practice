package day12;

public class Thread_ex {

	public static void main(String[] args) {
		IOstream t1 = new BeepThread();
		t1.setPriority(IOstream.MAX_PRIORITY);
		t1.start();

		Runnable r1 = new BeepThread2();
		IOstream t2 = new IOstream(r1);
		t1.setPriority(IOstream.MIN_PRIORITY);
		t2.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("È£");
			try {
				IOstream.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class BeepThread extends IOstream {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("¾ß");
			try {
				IOstream.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class BeepThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("!!!");
			try {
				IOstream.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}