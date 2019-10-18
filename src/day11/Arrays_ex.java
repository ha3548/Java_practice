package day11;

import java.util.Arrays;

public class Arrays_ex {

	public static void main(String[] args) {
		int num[] = { 2, 3, 6, 1, 5 };
		Arrays.sort(num);

		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();

		int index = Arrays.binarySearch(num, 6);
		System.out.println(index);

		String names[] = { "È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö" };
		Arrays.sort(names);
		for (String str : names) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		index = Arrays.binarySearch(names, "È«±æµ¿");
		System.out.println(index);

		Member3 m1 = new Member3("1", "È«±æµ¿");
		Member3 m2 = new Member3("2", "¹Úµ¿¼ö");
		Member3 m3 = new Member3("3", "±è¹Î¼ö");
		Member3[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (Member3 m : members) {
			System.out.print(m.name + " ");
		}
		System.out.println();
		index = Arrays.binarySearch(members, m1);
		System.out.println(index);
	}

}

class Member3 implements Comparable<Member3> {
	String no, name;

	Member3(String no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(Member3 o) {
		return no.compareTo(o.no);
	}
}