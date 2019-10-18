package day06;

public class Account_ex {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setBalance(1000);
		System.out.println("현재잔고: " + acc.getBalance());

		acc.setBalance(-100);
		System.out.println("현재잔고: " + acc.getBalance());

		acc.setBalance(2000000);
		System.out.println("현재잔고: " + acc.getBalance());

		acc.setBalance(300000);
		System.out.println("현재잔고: " + acc.getBalance());
	}
}
