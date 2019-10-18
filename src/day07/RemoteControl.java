package day07;

public interface RemoteControl {
	// 상수
	public static final int MAX_VOLUME = 20;
	public static final int MIN_VOLUME = 0;

	// 추상메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	public abstract int getVolume();
	
	//일반메소드
	public default void printTime() {
		System.out.println("현재시간 출력");
	}
	//정적메소드
	public static void changeBattery() {
		System.out.println("배터리교환");
	}
}
