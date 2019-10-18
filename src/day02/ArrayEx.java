package day02;

public class ArrayEx {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < 5; i++) {

			sum = sum + num[i];
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		int temp;
		
		temp=num[0];
		num[0]=num[1];
		num[1]=temp;
		
		System.out.println();
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
	}
}
