package day03;

import java.util.Scanner;

public class RSP2 {
	public static void main(String[] args) {
		int com = (int) (Math.random() * 3);// 0 1 2
		String comstr = null;
		switch (com) {
		case 0:
			comstr = "가위";
			break;
		case 1:
			comstr = "바위";
			break;
		case 2:
			comstr = "보";
			break;
		}

		Scanner sc = new Scanner(System.in);
		int my = sc.nextInt();
		sc.close();
		
		String mystr = null;
		switch (my) {
		case 0:
			mystr = "가위";
			break;
		case 1:
			mystr = "바위";
			break;
		case 2:
			mystr = "보";
			break;
		}

		System.out.println("컴퓨터: " + comstr);
		System.out.println("사용자: " + mystr);

		int result = (my - com + 2) % 3; // *공식* 0user 1com 2draw
		switch(result) {
		case 0:
			System.out.println("사용자가 이겼습니다.");
			break;
		case 1:
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		case 2:
			System.out.println("비겼습니다.");
			break;
		}

	}
}
