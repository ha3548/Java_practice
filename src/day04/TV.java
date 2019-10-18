package day04;

public class TV {
	String company;
	int size;
	int price;
	boolean power;
	int volume;
	int channel;

	TV(String company) {
		this.company = company;
		power = false;
		size = 65;
		price = 1000000;
		volume = 0;

	}

	void powerOn() {
		power = true;
		System.out.println("전원: ON");
	}

	void powerOff() {
		power = false;
		System.out.println("전원: Off");
	}

	void volumeUp() {
		if (power) {
			if (volume < 100) {
				volume++;
				System.out.println("볼륨: " + volume);
			} else {
				System.out.println("현재 볼륨은 최대입니다.");
			}
		}
	}

	void volumeDown() {
		if (power) {
			if (volume > 0) {
				volume--;
				System.out.println("볼륨: " + volume);
			} else {
				System.out.println("현재 볼륨은 0입니다.");
			}
		}
	}

	void channel_ck(int c) {
		if (power) {
			channel = c;
			System.out.println("채널: " + channel);
		}
	}

}
