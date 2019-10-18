package day12;

import java.util.TreeSet;

public class TreeSet_ex {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<>();
		score.add(70);
		score.add(80);
		score.add(90);
		score.add(80);

		int s = score.first();
		System.out.println(s);

		s = score.last();
		System.out.println(s);

	}

}
