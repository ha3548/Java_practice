package day01;

public class Switch {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;

		// Switch문
		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;

		}

		// If문
		if (num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		} else if (num == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}

		System.out.println();

		// 랜덤으로 0~100 만들기
		int score = (int) (Math.random() * 100);

		switch (score / 10) {
		case 9:
			System.out.println(score);
			System.out.println("A");
			break;
		case 8:
			System.out.println(score);
			System.out.println("B");
			break;
		case 7:
			System.out.println(score);
			System.out.println("C");
			break;
		case 6:
			System.out.println(score);
			System.out.println("D");
			break;
		default:
			System.out.println(score);
			System.out.println("F");
			break;
		}

		if (score >= 90) {
			System.out.println(score);
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println(score);
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println(score);
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println(score);
			System.out.println("D");
		} else {
			System.out.println(score);
			System.out.println("F");
		}

	}
}