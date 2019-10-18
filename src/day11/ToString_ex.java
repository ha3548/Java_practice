package day11;

public class ToString_ex {
	public static void main(String args[]) {
		Object obj = new Object();
		System.out.println(obj.hashCode());
		System.out.println(Integer.toString(obj.hashCode()));
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}

class Print {
	int num = 10;
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}