package day10;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean KeyCompare = p1.getKey().equals(p2.getKey());
		boolean ValueCompare = p1.getValue().equals(p2.getValue());

		return KeyCompare && ValueCompare;
	}

	// ºÎ¸ðÅ¬·¡½º: Number
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}

	public static void main(String args[]) {
		Pair<Integer, String> p1 = new Pair<>(1, "»ç°ú");
		Pair<Integer, String> p2 = new Pair<>(1, "¿À·»Áö");

		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if (result1 == true) {
			System.out.println("°°Àº °´Ã¼");
		} else {
			System.out.println("´Ù¸¥ °´Ã¼");
		}

		Pair<String, String> p3 = new Pair<>("user1", "hong");
		Pair<String, String> p4 = new Pair<>("user1", "hong");

		boolean result2 = Util.compare(p3, p4);
		if (result2 == true) {
			System.out.println("°°Àº °´Ã¼");
		} else {
			System.out.println("´Ù¸¥ °´Ã¼");
		}

		int result3 = Util.compare(10, 20);
		System.out.println(result3);
		int result4 = Util.compare(20, 20);
		System.out.println(result4);
		int result5 = Util.compare(0.1, 0.2);
		System.out.println(result5);
		int result6 = Util.compare(0.2, 0.2);
		System.out.println(result6);

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