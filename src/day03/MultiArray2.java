package day03;

public class MultiArray2 {
	public static void main(String[] args) {
		int[][] gugudan = { { 9, 1, 9 }, { 9, 2, 18 }, { 9, 3, 27 }, { 9, 4, 36 }, { 9, 5, 45 }, { 9, 6, 54 },
				{ 9, 7, 63 }, { 9, 8, 72 }, { 9, 9, 81 } };

		int[][] gugudan2 = new int[9][3];

		for (int i = 0; i < 9; i++) {
			gugudan2[i][0] = 9;
			gugudan2[i][1] = i + 1;
			gugudan2[i][2] = gugudan2[i][0] * gugudan2[i][1];
		}

		for (int i = 0; i < 9; i++) {
			System.out.println(gugudan[i][0] + " " + gugudan2[i][1] + " " + gugudan2[i][2] + " ");
		}

		// ÁÖ¼Ò°ª
		System.out.println(gugudan2);
		System.out.println(gugudan2[0]);
		System.out.println(gugudan2[0][0]);
	}
}
