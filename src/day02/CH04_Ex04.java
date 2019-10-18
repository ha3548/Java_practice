package day02;

public class CH04_Ex04 {
	public static void main(String[] args) {
		//for¹®
		int i = 0;
		int j = 0;

		for (;;) {

			i = (int) (Math.random() * 6) + 1;
			j = (int) (Math.random() * 6) + 1;

			if (i + j != 5) {
				System.out.println("(" + i + "," + j + ")");
			} else {
				System.out.println("(" + i + "," + j + ")");
				break;
			}
		}
		
		//while¹®
		/*while (i + j != 5) {
			i = (int) (Math.random() * 6) + 1;
			j = (int) (Math.random() * 6) + 1;

			System.out.println("(" + i + "," + j + ")");
		}*/

	}
}
