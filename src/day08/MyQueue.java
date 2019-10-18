package day08;

public class MyQueue {
	public static void main(String[] args) {
		Queue q = new Queue() {
			char[] charArr = new char[5];
			// 1 2 3 4 5
			int head = -1, tail = -1;

			@Override
			public int size() {
				return tail + 1;
			}

			@Override
			public Object peek() {
				char result = ' ';
				if (head != -1) {
					result = charArr[head];
				} else {
					System.out.println("배열에 값이 없습니다.");
				}
				return result;
			}

			@Override
			public Object pop() {
				if (tail == -1)
					System.out.println("배열 EMPTY!");

				char temp = charArr[++head];// 읽고
				charArr[head] = ' ';// 삭제

				if (head == tail) {
					head = -1;
					tail = -1;
				}
				return temp;
			}

			@Override
			public boolean push(Object ob) {
				if (tail + 1 < 5) {
					charArr[++tail] = (char) ob;
				} else {
					System.out.println("배열 FULL!");
				}
				return true;
			}

			@Override
			public boolean empty() {
				if (tail == -1) {
					return true;
				} else {
					return false;
				}
			}
		};

		q.push('a');
		q.push('b');
		q.push('c');
		q.push('d');
		q.push('e');
		q.push('e');
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.empty());
	}

}

interface Queue {
	public abstract int size(); // 원소 갯수

	public abstract Object peek();// 읽기

	public abstract Object pop();// 읽고 삭제

	public abstract boolean push(Object ob);// 삽입

	public abstract boolean empty();
}