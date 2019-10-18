package day10;

class Product<T,M> {
	private T kind;
	private M model;
	
	T getKind() {return this.kind;}
	M getModel() {return this.model;}
	
	void setKind(T kind) {this.kind = kind;}
	void setModel(M model) {this.model = model;}
}

public class Product_ex {
	public static void main(String args[]) {
		Product<String,Integer> p = new Product<>();
		p.setKind("TV");
		p.setModel(808);
		
		p.getKind();
		p.getModel();
	}
}