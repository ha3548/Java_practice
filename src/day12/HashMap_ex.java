package day12;

import java.util.*;

public class HashMap_ex {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("hong", 20);
		map.put("lee", 30);
		map.put("kim", 40);

		Set<String> set = map.keySet();

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + ": ");
			System.out.println(map.get(str));
		}
	}

}
