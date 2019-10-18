package day08_Ex;

public class GoodsStock {
	String goodsCode;
	int stockNum;

	GoodsStock(String code, int num) {
		goodsCode = code;
		stockNum = num;
	}

	void addStock(int amount) {
		stockNum += amount;
	}

	int subtractStock(int amount) throws StockShortageException {
		if (stockNum < amount)
			throw new StockShortageException("재고가 부족합니다.");
		else
			stockNum -= amount;

		return amount;
	}

	public static void main(String args[]) {
		try {
			GoodsStock goods = new GoodsStock("111", 10);
			goods.subtractStock(15);
		} catch (StockShortageException e) {
			System.out.println(e.getMessage());
		}
	}
}

class StockShortageException extends Exception {
	StockShortageException(String message) {
		super(message);
	}
}