package day12_Ex;

import java.util.*;

public class ex03 {

	static int getGroupCount(TreeSet tset, int from, int to) {
		Student s1 = new Student("", 0, 0, from, from, from);
		Student s2 = new Student("", 0, 0, to, to, to);
		return tset.subSet(s1, s2).size();
	}

	public static void main(String[] args) {

		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Student && o2 instanceof Student) {
					Student c1 = (Student) o1;
					Student c2 = (Student) o2;
					System.out.println((c1.getTotal() - c2.getTotal()) + "\t/" + c1.toString() + "/" + c2.toString());
					return c1.getTotal() - c2.getTotal();
				}
				return -1;
			}

		});

		set.add(new Student("È«±æµ¿", 1, 1, 100, 100, 100));
		set.add(new Student("¿©µ¿ºó", 1, 2, 90, 70, 80));
		set.add(new Student("±èÀÚ¹Ù", 1, 3, 80, 80, 90));
		set.add(new Student("ÀÌÀÚ¹Ù", 1, 4, 70, 90, 70));
		set.add(new Student("¾ÈÀÚ¹Ù", 1, 5, 60, 100, 80));

		Iterator it = set.iterator();
		while (it.hasNext()) {
//          System.out.println("xx");
			System.out.println("**" + it.next());
		}

		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));

	}

}

class Student2 implements Comparable<Student2> {
	String name;
	int ban, no, kor, eng, math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Student2 o) {
		if (o instanceof Student2) {
			Student2 tmp = (Student2) o;
			return name.compareTo(tmp.name);
		} else {
			return -2;
		}
	}

}