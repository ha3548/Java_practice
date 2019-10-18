package day11;

import java.util.*;

public class Compare_ex {

	public static void main(String[] args) {
		Student s1 = new Student(10);
		Student s2 = new Student(10);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
	}

}

class Student {
	int no;

	Student(int no) {
		this.no = no;
	}
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.no > s2.no) {
			return -1;
		} else if (s1.no < s2.no) {
			return 1;
		} else {
			return 0;
		}
	}

}