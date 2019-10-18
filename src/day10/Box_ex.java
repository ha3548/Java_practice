package day10;

public class Box_ex {
	public static void main(String args[]) {
		Box<String> box1 = new Box<String>(); // 힙 영역에 올라가기때문에 타입을 정해줌
		box1.set("1234");
		String str = box1.get();
		
		Box2 box2 = new Box2();
		box2.set("hello");
		box2.set(123456);
		box2.set(new VV());//Object
		
		Box<Integer> box3 = new Box<Integer>();
	}
}

class Box<T> {
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
	
	public static <T> Box<T> boxing(T t) {
		Box<String> box = new Box<>();
		return (Box<T>) box;
	}
}

class Box2 {
	private Object t;
	public Object get() {return t;}
	public void set(Object t) {this.t = t;}
}

interface Box3<O> {
	static int a=0;
	public O get();
	public void set(O t);
}

class VV{}