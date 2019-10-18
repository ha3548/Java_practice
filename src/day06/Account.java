package day06;

public class Account {

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	int balance;

	Account() {
		balance = 0;// �ʱⰪ
	}

	void setBalance(int balance) {
		if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
		} else {
			this.balance = balance;
		}
	}

	int getBalance() {
		return this.balance;
	}
}
