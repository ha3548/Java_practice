package day13;

public class ThreadJoin {

	public static void main(String[] args) {
		sumThread sth = new sumThread();
		sth.start();
		
		try {
			sth.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sth.sum);
	}

}

class sumThread extends Thread {
	long sum = 0;

	public void run() {
		for (int i = 0; i <= 100; i++) {
			this.sum += i;
		}
	}
}
