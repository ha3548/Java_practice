package day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_ex {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E요일, " + "yyyy년의  w번째주, " + "MM월의  W번째주");
		System.out.println(sdf.format(now));

	}

}
