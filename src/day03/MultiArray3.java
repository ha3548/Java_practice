package day03;

public class MultiArray3 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int k = 1;

		for (int i = 0; i < 5; i++) {

			if (i % 2 == 0) {//0,2,4За
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = k;
					k++;
				}
			}

			else {//1,3За
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[i][j] = k;
					k++;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
