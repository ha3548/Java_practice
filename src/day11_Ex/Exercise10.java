package day11_Ex;

import java.util.regex.Pattern;

public class Exercise10 {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]([a-zA-Z_0-9]{7,11})";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		} else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}

	}

}