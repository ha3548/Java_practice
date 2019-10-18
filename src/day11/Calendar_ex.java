package day11;

import java.util.Calendar;
import java.util.TimeZone;

public class Calendar_ex {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		TimeZone tz = now.getTimeZone();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;// 0부터시작
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int ampm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(ampm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}
}
