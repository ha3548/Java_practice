package day03;

public class SelectiveSort2 {
	public static void main(String[] args) {
		int num[] = { 20, 17, 6, 8, 40, 39 };
		int temp;

		int min = 1000;
		for (int j = 0; j < num.length - 1; j++) {
			min = j;

			for (int i = j + 1; i < num.length; i++) {
				if (num[min] > num[i]) {
					min = i;
				}
			}

			temp = num[j];
			num[j] = num[min];
			num[min] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}
}
