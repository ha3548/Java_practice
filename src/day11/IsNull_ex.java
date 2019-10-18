package day11;

import java.util.Objects;

public class IsNull_ex {

	public static void main(String[] args) {
		String st1 = "hong";
		String st2 = null;
		
		System.out.println(Objects.isNull(st1));
		System.out.println(Objects.isNull(st2));
	}

}
