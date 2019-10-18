package day03;

import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자: ");
		int user = sc.nextInt();
		sc.close();
		
		int com = (int) (Math.random() * 3);
		System.out.println("컴퓨터: " + com);

		if(com==user) {
			System.out.println("비겼습니다.");
			
		} else if(user>=0 && user<=2){
			if(com==0) {
				if(user==1)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");
				
			} else if (com==1) {
				if(user==2)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");				
				
			} else if (com==2) {
				if(user==0)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");				
			}
			
		} else {
			System.out.println("잘못된입력!");
		}

		
	}
}
