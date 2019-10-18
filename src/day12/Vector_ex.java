package day12;

import java.util.*;

public class Vector_ex {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		
		List<Board> linked = new LinkedList<>();
		linked.add(new Board("제목3", "내용3", "글쓴이3"));
		linked.add(new Board("제목4", "내용4", "글쓴이4"));
		
		for (int i = 0; i < 2; i++) {
			Board b1 = list.get(i);
			System.out.print(b1.content);
			System.out.print(b1.subject);
			System.out.print(b1.writter);
			System.out.println();
		}
		
		for (int i = 0; i < 2; i++) {
			Board b2 = linked.get(i);
			System.out.print(b2.content);
			System.out.print(b2.subject);
			System.out.print(b2.writter);
			System.out.println();
		}

	}

}

class Board {
	String subject, content, writter;

	Board(String s, String c, String w) {
		subject = s;
		content = c;
		writter = w;
	}
}