package day11;

public class String_ex {

	public static void main(String[] args) {
//		String str = "abc";

		// 기본변수
//		char ch = 't';
//		int in = 10;
		byte[] bytes = { 72, 101, 108, 108, 111, 13, 10 };// ASCII
		String str1 = new String(bytes);

		System.out.println(str1);

		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		String str2 = "Monday";
		try {
			byte[] str2Bytes = str2.getBytes("UTF-8");
			for (int i = 0; i < str2Bytes.length; i++) {
				System.out.print(str2Bytes[i] + " ");
			}

			String str3 = new String(str2Bytes);
			System.out.println(str3);

		} catch (Exception e) {

		}

		String str4 = "ABCDEFGHIJ";
		int index = str4.indexOf("BDF");
		System.out.println("index: " + index);

		String str5 = "안녕하세요. 자바입니다.";
		String str6 = str5.replace("자바", "JAVA");
		System.out.println(str6);

		String str7 = "880808-1008088";
		String year = str7.substring(0, 2);
		String gender = str7.substring(7, 8);
		System.out.println(year + "년생, 성별:" + gender);

		String str8 = "Hello JAVA";
		System.out.println(str8.toLowerCase());
		System.out.println(str8.toUpperCase());

		String strInt = String.valueOf(100);
		String strBoolean = String.valueOf(true);
		String strDouble = String.valueOf(100.1234);
		char[] charr = { 'h', 'e', 'l', 'l', 'o' };
		String strCharArr = String.valueOf(charr);

		System.out.println(strInt);
		System.out.println(strBoolean);
		System.out.println(strDouble);
		System.out.println(strCharArr);
	}

}
