package day11;

import java.util.*;

public class Hashcode_ex {
	public static void main(String args[]) {
		HashMap<Key, String> hashmap = new HashMap<>();
		hashmap.put(new Key(1), "홍길동");

		String value = hashmap.get(new Key(1));
		System.out.println(value);
	}
}

class Key {
	public int number;

	Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	// NULL출력 -> hashCode()리턴값이 다르기때문

	@Override
	public int hashCode() {
		return number;
	}

	// 홍길동 출력 -> equals()와 hashCode()리턴값이 모두 같다, 같은객체로 평가
	// 따라서, equals()와 hashCode() 모두 재정의(Override)해야한다!

}