package day04_Ex;

public class Exercise3 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			/*if (answer[i] == 1) {
				counter[0] += 1;
			} else if (answer[i] == 2) {
				counter[1] += 1;
			} else if (answer[i] == 3) {
				counter[2] += 1;
			} else if (answer[i] == 4) {
				counter[3] += 1;
			}*/

			counter[answer[i] - 1]++;
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.print(i+1+"ÀÇ °³¼ö: "+counter[i]);
			for (int j = 0; j < counter[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
