package day13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor threadPool = (ThreadPoolExecutor) es;
					int poolSize = threadPool.getPoolSize();// 2
					String threadName = Thread.currentThread().getName();
					System.out.println("스레드 개수: " + poolSize + ", 작업 스레드:" + threadName);
				}
			};
			es.execute(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		es.shutdown();
	}
}
