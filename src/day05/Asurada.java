package day05;

public class Asurada {
	String master;
	boolean power;
	String mode;// D 운행, B 가속, N 노말
	int cSpeed; // 10 up
	int gas; // 10 down
	int maxSpeed;

	Asurada() { // 초기값 셋팅
		cSpeed = 0;
		gas = 100;
		maxSpeed = 200;
		power = false;
	}

	Asurada(String master) {
		this(); // Asurada() 생성자 호출
		if (master == "Bong") {
			System.out.println("곤니찌와 " + master);
			power = true;
		}
	}

	void transfer(String mode) {
		if (power && this.mode == "N" && mode == "D") {
			this.mode = mode;// N -> D
		} else if (power && this.mode == "D" && mode == "B") {
			this.mode = mode;// D -> B
		} else if (power && mode == "N") {
			this.mode = mode;// D,B -> N
		} else {
			System.out.println("기어변속을 할 수 없음!");
			System.out.println("당신은 차주가 아닙니다.");
		}
	}

	void booster() {
		if (power && mode == "B") {
			cSpeed = 300;
			gas -= 20;
			System.out.println("**Booster ON**");
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);// 1초
					System.out.println("Booster: " + (i + 1) + "초");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("**Booster OFF**");
			cSpeed = maxSpeed;

		} else {
			System.out.println("부스터 모드를 동작할 수 없습니다.");
		}

	}

	void accel() {
		if (power && this.mode == "D") {
			if (gas >= 10 && cSpeed <= maxSpeed) {
				if (cSpeed <= maxSpeed - 10) {
					cSpeed += 10;
					gas -= 10;
				} else if (cSpeed == maxSpeed) {
					System.out.println("현재최고속도!");
				} else {
					cSpeed = maxSpeed;
					gas -= 10;
				}
			} else {
				System.out.println("기름잔량없음!");
			}
		}
	}

	void stop() {
		if (power) {
			if (cSpeed > 20) {
				cSpeed -= 20;
			} else if (cSpeed == 0) {
				System.out.println("이미 멈춰있음!");
			} else {
				cSpeed = 0;
			}
		}
	}

	void speed_ck() {
		System.out.println(cSpeed + "km");
	}

}
