package day03;

public class GCD_LCM2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		int max = (num1 > num2) ? num1 : num2;
		int g=0;
		int h=0;
		
		//최대공약수
		for(int i=1; i<=max;i++) {
			if(num1%i==0 && num2%i==0) {
				g=i;
			}
		}
		System.out.println(g);
		
		//최소공배수
		for(int i=max;i<100000;i++) {
			if(i%num1==0 && i%num2==0) {
				h=i;
				break;
			}
		}
		System.out.println(h);
	

	}
}
