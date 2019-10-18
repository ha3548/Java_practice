package day11_Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise13 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String time1 = sdf.format(now);
		System.out.println(time1);
	}

}
