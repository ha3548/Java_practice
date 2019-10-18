package day07;

public class Node_ex {
	public static void main(String[] args) {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();

		n1.back = n2;
		n2.back = n3;
		n2.front = n1;
		n3.front = n2;

		/*
		 * System.out.println(n1.back); System.out.println(n2);// n2.toString()->고유값
		 * System.out.println(n2.back); System.out.println(n3);
		 * System.out.println(n2.front); System.out.println(n1);
		 * System.out.println(n3.front); System.out.println(n2);
		 */

		Node temp = new Node();// 1)추가
		temp.front = n2;
		temp.back = n3;
		n2.back = temp;
		n3.front = temp;

		n1.back = n2;
		n2.back = n3;
		n2.front = n1;
		n3.front = n2;
		temp = null;// 2)삭제: 가비지컬렉션을 자바가 알아서 회수해간다

		
		
		int size = 0;
		Node IndexNode = n1;
		size++;

		while (true) {
			if (IndexNode.back != null) {
				size++;
				IndexNode = IndexNode.back;
			} else
				break;
		}
		System.out.println(size);

		n1.num = 2;
		n2.num = 3;
		n3.num = 4;
		IndexNode = n1;
		for (int i = 0; i < size - 1; i++) {
			IndexNode = IndexNode.back;
		}
		System.out.println(IndexNode.num);
	}
}

class Node {
	int num;
	Node front, back;
}