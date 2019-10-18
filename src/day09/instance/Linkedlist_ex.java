package day09.instance;

public class Linkedlist_ex {

	   Node head;
	   Node rear;
	   int size = 0;

	   void firstNode(int data) {
	      Node newNode = new Node(data);
	      head = newNode;
	      rear = newNode;
	      size++;
	      System.out.println("firstNode(int data) 실행");
	   }

	   void addRearNode(int data) {
	      if (size != 0) {
	         Node newNode = new Node(data);
	         rear.back = newNode;
	         newNode.front = rear;
	         rear = newNode;
	         size++;
	         System.out.println("addRearNode(int data) 실행");
	      } else {
	         System.out.println("firstNode(int data) 실행시켜주세요");
	      }
	   }

	   // 앞단에 Node 추가
	   void addHeadNode(int data) {
	      if (size != 0) {
	         Node newNode = new Node(data);
	         head.front = newNode;
	         newNode.back = head;
	         head = newNode;
	         size++;
	         System.out.println("맨앞에 " + data + " 들어감");
	      } else {
	         firstNode(data);
	      }
	   }

	   // 특정 위치(index) Node Data 읽기
	   int readData(int index) {
	      int result = 0;
	      try {
	         Node node = head;
	         for (int i = 0; i < index - 1; i++) {
	            node = node.back;
	         }
	         result = node.data;
	      } catch (Exception e) {
	         System.out.println("readData(int index) Exception 발생");
	      }
	      return result;
	   }

	   // 전체 노드의 data 출력 ex) 10 20 30 40 50
	   void printData() {
	      if (size > 0) {
	         try {
	            Node node = head;
	            for (int i = 0; i < size; i++) {
	               System.out.print(node.data + " ");
	               node = node.back;
	            }
	         } catch (Exception e) {
	            System.out.println("printData() Exception 발생");
	         }
	      } else {
	         System.out.println("출력데이터가 없습니다.");
	      }
	   }

	   // 특정 위치(index) Node 삭제
	   boolean removeNode(int index) {
	      if ((index <= size && index > 0) && size > 0) {
	         if (index == 1) {// head를 지울때
	            head = head.back;
	            head.front = null;
	         } else if (index == size) {// rear를 지울때
	            rear = rear.front;
	            rear.back = null;
	         } else {
	            Node node = head;
	            for (int i = 1; i < index; i++) {
	               node = node.back;
	            }
	            node.front.back = node.back;
	            node.back.front = node.front;
	         }
	         size--;
	         return true;
	      } else {
	         System.out.println("index 범위X");
	         return false;
	      }
	   }

	   // 전체 Node 삭제
	   boolean removeAllNode() {
	      head = null;
	      rear = null;
	      size = 0;
	      return true;
	   }

	   class Node {
	      Node(int data) {
	         this.data = data;
	      }

	      int data;
	      Node front = null;
	      Node back = null;
	   }
	}