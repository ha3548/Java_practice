package day04;

public class lotto {
	public static void main(String[] args) {
		int[] arr = new int[6];

		for (int i = 0; i < 6; i++) {
			arr[i] = (int) (Math.random() * 6) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		for (int num : arr)
			System.out.print(num+" ");
	}
}
