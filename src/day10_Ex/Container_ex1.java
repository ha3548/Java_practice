package day10_Ex;

public class Container_ex1 {
	public static void main(String[] args) {
		Container1<String> container1 = new Container1<String>();
		container1.set("ȫ�浿");
		String str = container1.get();
		System.out.println(str);

		Container1<Integer> container2 = new Container1<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
	}
}

class Container1<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}