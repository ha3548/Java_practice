package day08;

public class QueueEx {
	public static void main(String[] args) {
		Que q = new Que() {
			int length = 5;
			char[] arr = new char[length];
			int pIn = 0;
			int pOut = 0;

			// 0 1 2 3 4
			@Override
			public boolean push(Object ob) {
				if (size() < length) {
					arr[pIn] = (char) ob;
					pIn = (pIn + 1) % length;// 0 1 2 3 4
					System.out.println("입력 : " + (char) ob);
					return true;
				} else {
					System.out.println("값을 넣을 수 없습니다.");
					return false;
				}
			}

			@Override
			public Object pop() {
				char result = arr[pOut];
				arr[pOut] = ' ';
				pOut = (pOut + 1) % length;// 0 1 2 3 4
				System.out.println("출력 : " + result);

				return result;
			}

			@Override
			public Object peek() {
				char result = arr[pOut];
				System.out.println("읽기 : " + result);
				return result;
			}

			@Override
			public boolean empty() {
				boolean result;

				if (pIn == pOut) {
					result = false;
				} else {
					result = true;
				}
				return result;
			}

			@Override
			public int size() {
				int cnt = 0;
				for (int i = 0; i < length; i++) {
					if (((arr[i] >= 65) && (arr[i] <= 90)) || (arr[i] >= 97) && (arr[i] <= 122)) {
						cnt++;
					}
				}
				return cnt;
			}
		};

		q.push('a');
		q.push('b');
		q.push('c');
		q.push('d');
		q.push('e');
		q.pop();
		q.pop();
		q.pop();
		q.push('f');
		q.push('g');
		q.push('h');
		q.push('i');
	}
}

interface Que {
	public abstract int size(); // 원소 갯수

	public abstract Object peek(); // 읽기

	public abstract Object pop(); // 읽고 삭제

	public abstract boolean push(Object ob); // 삽입

	public abstract boolean empty(); // 확인
}