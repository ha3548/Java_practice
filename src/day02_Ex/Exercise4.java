package day02_Ex;

public class Exercise4 {
	public static void main(String[] args) {

		int i = 1;

		while (i <= 10) {

			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}

			System.out.println();
			i++;
		}

	}
}
