package day03;

public class ArrayCopy {
	public static void main(String[] args) {

		String[] oldStrArr = { "Java", "Copy" };
		String[] newStrArr = new String[5];

		for (int i = 0; i < oldStrArr.length; i++) {
			newStrArr[i] = oldStrArr[i];
		}

		// 얕은복사 = 원본&복사본
		newStrArr[0] = "Array";

		for (int i = 0; i < newStrArr.length; i++) {
			System.out.println(newStrArr[i]);
		}
		System.out.println();

		for (int i = 0; i < oldStrArr.length; i++) {
			System.out.println(oldStrArr[i]);

		}
	}
}
