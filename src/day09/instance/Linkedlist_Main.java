package day09.instance;

public class Linkedlist_Main {
	public static void main(String args[]) {
		Linkedlist_ex list = new Linkedlist_ex();

		list.firstNode(1);
		list.addRearNode(2);
		list.addHeadNode(3);
		list.readData(4);
		list.printData();
		list.removeNode(5);
		list.removeAllNode();
	}
}
