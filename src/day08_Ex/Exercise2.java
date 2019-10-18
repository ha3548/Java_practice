package day08_Ex;

public class Exercise2 {
	public static void main(String args[]) {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException {
	private String message;
	final private int ERR_CODE;

	public UnsupportedFunctionException() {
		this.ERR_CODE = 100;
	}

	public UnsupportedFunctionException(String message, int ERR_CODE) {
		this.message = message;
		this.ERR_CODE = ERR_CODE;
	}

	public int getErrorCode() {
		return ERR_CODE;

	}

	public String getMessage() {
		return "[" + getErrorCode() + "]" + message;

	}

}