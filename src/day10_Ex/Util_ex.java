package day10_Ex;

public class Util_ex {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("È«±æµ¿", 35);
		Integer age = Util.getValue(pair, "È«±æµ¿");
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<>("È«»ï¿ø", 20);
		Integer childAge = Util.getValue(childPair, "È«»ï¼ø");
		System.out.println(childAge);

		/*
		 * OtherPair<String, Integer> otherPair = new OtherPair<>("È«»ï¿ø", 20); //
		 * OtherPairÀº PairÀ» »ó¼ÓÇÏÁö ¾ÊÀ¸¹Ç·Î ¿¹¿Ü°¡ ¹ß»ýÇØ¾ß ÇÕ´Ï´Ù. int otherAge =
		 * Util.hetValue(otherPair, "È«»ï¿ø"); System.out.println(otherAge);
		 */
	}

}

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.setKey(key);
		this.setValue(value);
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K key, V value) {
		super(key, value);
	}
}

class OtherPair<K, V> {
	private K key;
	private V value;

	public OtherPair(K key, V value) {
		this.setKey(key);
		this.setValue(value);
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

class Util {
	public static <K, V> Integer getValue(Pair<String, Integer> p, String string) {
		if (p.getKey().equals(string)) {
			return p.getValue();
		} else {
			return null;
		}
	}
}