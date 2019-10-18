package day12;

import java.util.*;

public class ArrayList_ex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Collection");
		list.add("List");
		list.add(2, "loop");

		printList(list);
		System.out.println();
		list.remove(2);//ªË¡¶
		printList(list);
		System.out.println();
		list.remove(3);
		printList(list);

	}

	private static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
