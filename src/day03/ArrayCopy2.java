package day03;

public class ArrayCopy2 {
	public static void main(String[] args) {

		String[] oldStrArr = { "Java", "Copy" };
		String[] newStrArr = new String[5];

		// ±Ì¿∫∫πªÁ
		System.arraycopy(oldStrArr, 0, newStrArr, 1, 2);

		for (int i = 0; i < newStrArr.length; i++) {
			System.out.println(newStrArr[i]);
		}
		System.out.println();

		for (int i = 0; i < oldStrArr.length; i++) {
			System.out.println(oldStrArr[i]);

		}
	}
}
