package day10;

public class BoxingUnBoxing {
	public static void main(String args[]) {
		int a = 10;
		Integer obj1 = new Integer(10);
		Integer obj2 = a;// Boxing: Value->Object

		System.out.println(a);
		System.out.println(obj1);
		System.out.println(obj2);

		double b = (double) a;
		System.out.println(b);

		double c = obj2.doubleValue() + 10.0;// UnBoxing: Object->Value
		System.out.println(c);

		int max = obj1.MAX_VALUE;
		System.out.println(max);

		Integer num = new Integer("12345");
		System.out.println(num);

		int num2 = obj1.valueOf("12345");
		System.out.println(num2);

	}
}
