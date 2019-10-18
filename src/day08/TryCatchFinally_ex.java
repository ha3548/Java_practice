package day08;

public class TryCatchFinally_ex {
	public static void main(String[] args) {
		String[] strArray = new String[2];
		strArray[0] = args[0]; // "10"
		strArray[1] = args[1]; // "2a"
		strArray[2] = args[2]; // "20"

		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");

			} catch (NumberFormatException e) {
				System.out.println("숫자변환 불가");

			} finally {
				System.out.println(value);
			}
		}
	}
}
