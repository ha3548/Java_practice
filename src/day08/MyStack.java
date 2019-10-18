package day08;

public class MyStack implements Stack {
	private OdolNode topNode;

	public MyStack() {
		this.topNode = null;
	}

	@Override
	public boolean push(Object data) {
		// 새로운 노드 생성
		OdolNode newNode = new OdolNode(data);
		// 새로운 노드의 다음노드를 삽입 이전의 top을 참조하도록
		newNode.setNextNode(topNode);
		// 삽입 이후의 탑은 새로운 노드
		topNode = newNode;
		return false;
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("empty");
		} else {
			// 탑노드의 데이터
			Object data = peek();
			// 새로운 탑노드는 현재 탑노드의 nextNode
			topNode = topNode.getNextNode();
			// 데이터 반환
			return data;

		}

	}

	@Override
	public Object peek() {

		if (isEmpty()) {
			throw new IndexOutOfBoundsException();

		} else {
			return topNode.getData(); // 데이터만 반환
		}
	}

	public boolean isEmpty() {
		return (topNode == null);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public static void main(String args[]) {
		MyStack ls = new MyStack();

		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.push(5);
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
	}

}

class OdolNode { // 스택에 활용할 노드 클래스

	private Object data; // 데이터를 저장
	private OdolNode nextNode; // 이전의 노드를 저장하기 위한 노드

	public OdolNode(Object data) {
		this.data = data;
		this.nextNode = null;
	}

	public Object getData() {
		return data;
	}

	public void setNextNode(OdolNode node) {
		nextNode = node;
	}

	public OdolNode getNextNode() {
		return nextNode;
	}

}

interface Stack {
	public abstract int length();// 현재 저장되어있는 데이터의 갯수

	public abstract Object pop();// 추출

	public abstract boolean push(Object ob);// 삽입

	public abstract Object peek();// 읽기
}