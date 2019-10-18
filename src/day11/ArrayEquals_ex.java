package day11;

import java.util.Arrays;

public class ArrayEquals_ex {

	public static void main(String[] args) {
		int[][] ori = { { 1, 2 }, { 3, 4 } };
		int[][] cloned1 = Arrays.copyOf(ori, ori.length);// 얕은복사(주소값)

		System.out.println(ori.equals(cloned1));
		System.out.println(Arrays.equals(ori, cloned1));
		System.out.println(Arrays.deepEquals(ori, cloned1));

		int[][] cloned2 = Arrays.copyOf(ori, ori.length);// 깊은복사(데이터)
		cloned2[0] = Arrays.copyOf(ori[0], ori[0].length);
		cloned2[1] = Arrays.copyOf(ori[1], ori[1].length);

		System.out.println(ori.equals(cloned2));
		System.out.println(Arrays.equals(ori, cloned2));
		System.out.println(Arrays.deepEquals(ori, cloned2));
	}

}
