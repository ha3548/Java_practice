package day05_Ex;

class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num1 = i % 10 + 1;
			int num2 = (i + 1) / 10;
			boolean isKwang = (i < 30)
					&& ((num1 == 3 || num1 == 6 || num1 == 9) || (num2 == 3 || num2 == 6 || num2 == 9));
			cards[i] = new SutdaCard(i + 1, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + " ");
		}
	}
}
