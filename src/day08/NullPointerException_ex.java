package day08;

//import java.lang.*

public class NullPointerException_ex {
	public static void main(String[] args) {

		try {// 예외가 발생할 가능성이 있는 구문

			char[] ch = new char[5];
			System.out.println(ch[5]);// ArrayIndexOutOfBoundsException

			String data = "data";// NullPointerException
			System.out.println(data.toString());

			String data1 = "100";
			String data2 = "a100";// NumberFormatException

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {// 예외 발생시 처리구문
			System.out.println("ArrayIndexOutOfBoundsException 발생 혹은");
			System.out.println("NullPointerException 발생");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Exception 발생");

		} finally {// 예외 상관없이 반드시 실행되는 구문
			System.out.println("Exception 확인 종료");
		}

		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal = dog;
		dog = (Dog) animal;
		changeDog(animal);
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}