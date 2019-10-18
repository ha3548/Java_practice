package day11_Ex;

import java.util.StringTokenizer;

public class Exercise08 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		String[] test = str.split(",");
		for (String t : test) {
			System.out.println(t);
		}
		System.out.println();

		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
