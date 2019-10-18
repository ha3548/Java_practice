package day12;

import java.util.*;

public class Exercise10 {

	public static void main(String[] args) {
		TreeSet<Student2> treeSet = new TreeSet<Student2>();
		treeSet.add(new Student2("blue", 96));
		treeSet.add(new Student2("hong", 86));
		treeSet.add(new Student2("white", 92));
		
		Student2 student = treeSet.last();
		System.out.println("최고점수: " + student.score);
		System.out.println("최고점수를 받은 아이디: " + student.id);

	}
}

class Student2 implements Comparable<Student2> {
	public String id;
	public int score;

	public Student2(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student2 o) {
		if (o.score > score) {
			return -1;
		} else if (o.score < score) {
			return 1;
		} else {
			return 0;
		}
	}

}