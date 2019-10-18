package day03;

public class SelectiveSort {
	public static void main(String[] args) {
		int arr[] = { 20, 17, 6, 8, 40, 39 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

		
		int sum = 0;
		double avg = 0;
		for (int i = arr.length - 1; i > arr.length - 4; i--) {
			sum += arr[i];
		}
		avg = sum / 3;
		System.out.println(avg);

	}
}
