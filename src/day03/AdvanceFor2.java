package day03;

public class AdvanceFor2 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// ¿œπ› For
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// Advanced For
		for (int[] num : arr) {
			for (int value : num) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}
}
