package day09.instance;

public class Linkedlist {

//	Node n1 = new Node();
//	Node n2 = new Node();
//	Node n3 = new Node();
//	0 1 2

	Node[] nodes = new Node[3];
	Node head, rear;

	void addRearNdoe(int num) {
		nodes[0].back = nodes[1];
		nodes[1].back = nodes[2];
		nodes[1].front = nodes[0];
		nodes[2].front = nodes[1];
		head = nodes[0];
		rear = nodes[2];

		Node NewNode = new Node();

		rear.back = NewNode;
		NewNode.front = rear;
	}

	class Node {
		int num;
		Node front, back;
	}
}
