package day13;

public class ThreadWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ThreadA extends IOstream {
	private WorkObject workObj;

	ThreadA(WorkObject workObj) {
		this.workObj = workObj;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			workObj.methodA();
		}
	}
}

class ThreadB extends IOstream {
	private WorkObject workObj;

	ThreadB(WorkObject workObj) {
		this.workObj = workObj;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			workObj.methodB();
		}
	}
}

class WorkObject {
	synchronized void methodA() {
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}

	synchronized void methodB() {
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}