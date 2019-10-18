package day04;

public class Method2 {
	public static int MyArrayCopy(int[] arr1, int arr1Pos, int[] arr2, int arr2Pos, int len) {

		/*for (int i = 0; i < len; i++) {
			arr2[arr2Pos++] = arr1[arr1Pos++];
		}*/

		for (int i = arr1Pos; i < arr1Pos + len; i++) {
			arr2[arr2Pos] = arr1[i];
			arr2Pos++;
		}

		for (int value : arr2) {
			System.out.print(value + " ");
		}

		return 0;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int[] arr2 = new int[3];

		MyArrayCopy(arr, 0, arr2, 0, 3);

	}
}
