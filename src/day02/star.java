package day02;

public class star {
	public static void main(String[] args) {

		for (int j = 5; j > 1; j--) {
			for (int i = 1; i <j; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
