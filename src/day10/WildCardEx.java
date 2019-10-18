package day10;

public class WildCardEx {
	public static void regCourse(Course<?> course) {
		
	}
	public static void regCourseStudent(Course<? extends Student> course) {
		//Student HighStudent
			
	}
	public static void regCourseWorker(Course<? super Worker> course) {
		//Worker Person
		
	}
	public static void main(String args[]) {
		regCourse(new Course<Person>());
		regCourse(new Course<Worker>());
		regCourse(new Course<Student>());
		regCourse(new Course<HighStudent>());
		
//		regCourseStudent(new Course<Person>());
//		regCourseStudent(new Course<Worker>());
		regCourseStudent(new Course<Student>());
		regCourseStudent(new Course<HighStudent>());
		
		
		
		regCourseWorker(new Course<Person>());
		regCourseWorker(new Course<Worker>());
//		regCourseWorker(new Course<Student>());
//		regCourseWorker(new Course<HighStudent>());
	}

}

class Course<T>{}
class Person {}
class Worker extends Person {}
class Student extends Person {}
class HighStudent extends Student {}
