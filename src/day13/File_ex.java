package day13;

import java.io.*;

public class File_ex {
	public static void main(String[] args) {
//		File file1 = new File("C:\Temp\foo.txt");
		File file1 = new File("C:/Temp/foo.txt");
		File file2 = new File("C:/Temp/foo2.txt");
		File dir = new File("C:/Temp/foo");

		try {
			file1.createNewFile();
			file2.delete();
			dir.mkdir();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
