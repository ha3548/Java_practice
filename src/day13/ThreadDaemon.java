package day13;

public class ThreadDaemon {

	public static void main(String[] args) {
		AutoSave autosave = new AutoSave();
		autosave.setDaemon(true);
		autosave.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class AutoSave extends Thread {
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("AutoSave ÇÕ´Ï´Ù.");
		}
	}
}