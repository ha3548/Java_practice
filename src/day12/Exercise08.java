package day12;

import java.util.*;

public class Exercise08 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();

		set.add(new Student(1, "È«±æµ¿"));
		set.add(new Student(2, "½Å¿ë±Ç"));
		set.add(new Student(1, "Á¶¹Î¿ì"));

		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.studentNum + ": " + s.name);
		}
	}

}

class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.studentNum == s.studentNum) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

}