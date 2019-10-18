package day11;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Date_ex {

	public static void main(String[] args) {
		Date now = new Date(0);
		String time = now.toString();
		System.out.println(time);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd. hh:mm:ss");
		String time2 = sdf.format(now);
		System.out.println(time2);
	}

}