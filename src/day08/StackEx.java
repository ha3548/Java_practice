package day08;

public class StackEx {
	public static void main(String[] args) {
		Staack s1 = new Staack() {
			char[] charArr = new char[5];
			// 1 2 3 4 5
			int pointer = 0;

			@Override
			public boolean push(Object ob) {
				if (pointer < 5) {
					charArr[pointer++] = (char) ob;
				} else {
					System.out.println("배열 FULL!");
				}
				return true;
			}

			@Override
			public Object pop() {
				char result = ' ';

				if (pointer != 0) {
					result = charArr[--pointer];
					charArr[pointer] = ' ';
				} else {
					System.out.println("배열 비어있음!");
				}
				return result;
			}

			@Override
			public Object peek() {
				char result = ' ';
				if (pointer != 0) {
					result = charArr[--pointer]; // pointer 미리 뺌
					pointer++;
				} else {
					System.out.println("배열에 값이 없습니다.");
				}
				return result;
			}

			@Override
			public int length() {
				return pointer;
			}

		};

		s1.push('a');
		s1.push('b');
		s1.push('c');
		s1.push('d');
		s1.push('e');
		s1.push('f');
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}

}

interface Staack {
	public abstract boolean push(Object ob);// 삽입

	public abstract Object pop();// 추출

	public abstract Object peek();// 읽기

	public abstract int length();// 현재 저장되어있는 데이터의 갯수
}