package day02_Ex;

public class Exercise9 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;// 거꾸로 바꾼수

		while (tmp != 0) {
			result = (result * 10) + tmp % 10;
			tmp = tmp / 10;
		}

		System.out.println("거꾸로 바꾼 수: " + result);

		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
}
