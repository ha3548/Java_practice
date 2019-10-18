package day09.instance;

public class Anonymous_ex2 {
	public static void main(String args[]) {
		Anonymous2 a = new Anonymous2();
		a.p.wake();
		a.method();

		a.method2(new Person() {
			void study() {
				System.out.println("study");
			}

			void wake() {
				study();
				System.out.println("wake");
			}
		});
	}
}

class Person {
	void work() {
	}

	void wake() {
		System.out.println("Wake");
	}

	void Walk() {
		System.out.println("Walk");
	}
}

class Anonymous2 {
	Person p = new Person() {

		@Override
		void Walk() {
			System.out.println("Walk");
		}
	};

	void method() {
		Person localVar = new Person() {
			void work() {
				System.out.println("Work");
			}

			void wake() {
				System.out.println("Wake");
				work();
			}
		};

		localVar.work();
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
