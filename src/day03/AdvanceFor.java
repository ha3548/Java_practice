package day03;

public class AdvanceFor {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// ¿œπ› For
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		// Advanced For
		for (int num : arr) {
			System.out.print(num);
		}

	}
}
