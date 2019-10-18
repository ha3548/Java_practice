package day05;

//CH06_Ex16
public class Printer_Ex {
	public static void main(String[] args) {
		Printer p = new Printer();
		p.Println(10);
		p.Println(true);
		p.Println(5.7);
		p.Println("홍길동");
	}
}

class Printer {// 같은 스크립트 내에서 클래스 만들때는 Public 사용X

		void Println(int x) {
			System.out.println(x);
		}
	
		void Println(boolean x) {
			System.out.println(x);
		}
	
		void Println(double x) {
			System.out.println(x);
		}
	
		void Println(String x) {
			System.out.println(x);
		}

}