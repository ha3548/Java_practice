package day10;

public class Storage_ex {

}

interface Storage<T> {
	public void add(T item, int index);

	public T get(int index);
}

class StorageImpl<T> implements Storage<T> {
	private T[] array;

	public StorageImpl(int cap) {
		this.array = (T[]) (new Object[cap]);// 제네릭타입이라고 알려주고 넣는다.
	}

	public void add(T item, int index) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

}