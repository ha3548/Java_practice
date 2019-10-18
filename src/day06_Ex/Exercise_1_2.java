package day06_Ex;

public class Exercise_1_2 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: " + t.getVolume());
		
		System.out.println();

		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());

	}
}

class MyTv {
	private boolean isPowerOn;
	private int channel, volume;
	int Prev_c;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	MyTv() {
		isPowerOn = true;
		channel = 1;
		volume = 0;
		Prev_c = channel;
	}

	boolean isPowerOn() {
		return isPowerOn;
	}

	void setPower(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	void setVolume(int v) {
		if (isPowerOn == false) {
			System.out.println("TV is OFF");
		} else if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = v;
		}
	}

	void setChannel(int c) {
		if (isPowerOn == false) {
			System.out.println("TV is OFF");
		} else if (this.channel != c) {
			Prev_c = this.channel;
			this.channel = c;
		}
	}

	int getChannel() {
		if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
			System.out.println("잘못입력하셨습니다.");
			return Prev_c;
		} else
			return channel;
	}

	int getVolume() {
		if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
			System.out.println("잘못입력하셨습니다.");
			return 0;
		} else
			return volume;
	}

	void gotoPrevChannel() {
		setChannel(Prev_c);
	}
}