package day02;

import java.lang.reflect.Array;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열 내림차순 정렬
		int[] num = { 10, 20, 30, 5, 98, 104,32 };
		int temp;
		int max = 0;

		for (int j = 0; j < Array.getLength(num); j++) {
			max = j;
			for (int i = j + 1; i < Array.getLength(num); i++) {
				if (num[max] < num[i]) {
					max = i;
				}
			}

			temp = num[j];
			num[j] = num[max];
			num[max] = temp;
		}

		for (int i = 0; i < Array.getLength(num); i++) {
			System.out.println(num[i]);
		}

	}
}
