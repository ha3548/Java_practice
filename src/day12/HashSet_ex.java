package day12;

import java.util.*;

public class HashSet_ex {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("Set");
		set.add("List");
		set.add("Set");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}

}
