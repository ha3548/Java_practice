package day13;

public class ThreadInterrupt {

	public static void main(String[] args) {
		Thread t = new PrintThread2();
		t.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t.interrupt();
	}

}

class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		while(true) {
//			System.out.println("실행중");
//			if(Thread.interrupted()) {
//				break;
//			}
//		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}