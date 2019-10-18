package day12;

public class ThreadState_ex {

	public static void main(String[] args) {

		TargetThread1 t1 = new TargetThread1();
		TargetThread2 t2 = new TargetThread2();

		t1.start();
		t2.start();

		try {
			IOstream.sleep(3000);
			System.out.println("3초 경과--------------");
		} catch (InterruptedException e) {
		}
		t2.work = false;

		try {
			IOstream.sleep(3000);
			System.out.println("3초 경과--------------");
		} catch (InterruptedException e) {
		}
		t2.work = true;

		try {
			IOstream.sleep(3000);
		} catch (InterruptedException e) {
		}
		t2.stop = true;
		t1.stop = true;

	}
}

class StatePrintThread extends IOstream {
	private IOstream targetT;

	StatePrintThread(IOstream targetT) {
		this.targetT = targetT;
	}

	public void run() {
		while (true) {
			IOstream.State state = targetT.getState();
			System.out.println(state);

			if (state == IOstream.State.NEW) {
				targetT.start();
			}

			if (state == IOstream.State.TERMINATED) {
				break;
			}

			try {
				IOstream.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class TargetThread1 extends IOstream {
	boolean stop = false;
	boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("t1 작업중");
				try {
					IOstream.sleep(500);
				} catch (Exception e) {
				}
			} else {
				IOstream.yield();
			}
		}
		System.out.println("t1 종료");
	}
}

class TargetThread2 extends IOstream {
	boolean stop = false;
	boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("t2 작업중");
				try {
					IOstream.sleep(500);
				} catch (Exception e) {
				}
			} else {
				IOstream.yield();
			}
		}
		System.out.println("t2 종료");
	}
}
