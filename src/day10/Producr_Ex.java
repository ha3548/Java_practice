package day10;

public class Producr_Ex {
	public static void main(String args[]) {
		ChildProduct<String, String, String> cp = new ChildProduct<>();

		cp.setKind("TV");
		cp.setModel("SmartTV");
		cp.setCompany("LG");
	}
}

class Produxt<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
}

class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}