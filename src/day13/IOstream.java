package day13;

import java.io.IOException;
import java.io.InputStream;

public class IOstream {
	public static void main(String[] args) {
		byte[] data = new byte[10];

		System.out.print("ют╥б: ");
		InputStream is = System.in;
		try {
			int size = is.read(data);
			String datas = new String(data);
			System.out.println(datas);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
