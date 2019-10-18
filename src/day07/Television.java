package day07;

public class Television implements RemoteControl {

	private int volume;

	public void printTime() {
		System.out.println("현재시간 풀력");
	}

	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV OFF");
	}

	@Override
	public void setVolume(int volume) {
		if (volume >= RemoteControl.MAX_VOLUME) {
			System.out.println("MAX VOLUME");
		} else if (volume < RemoteControl.MIN_VOLUME) {
			System.out.println("LEAST VOLUME");
		} else {
			this.volume = volume;
		}
	}

	@Override
	public int getVolume() {
		return volume;
	}
}
