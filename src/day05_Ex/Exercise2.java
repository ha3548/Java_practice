package day05_Ex;

public class Exercise2 {

	static int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -999999;
		}

		for (int i = 0; i < arr.length; i++) {
			int MaxValue = arr[0];
			if (MaxValue < arr[i]) {
				MaxValue = arr[i];
				return MaxValue;
			}
		}
		return arr[0];
	}

	static int abs(int value) {

		if (value < 0)
			return -value;
		else
			return value;
	}

	public static void main(String[] args) {
		int[] data= {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: "+max(data));
		System.out.println("최대값: "+max(null));
		System.out.println("최대값: "+max(new int[] {}));
		
		int value=5;
		System.out.println(value+"의 절대값: "+abs(value));
		value=-10;
		System.out.println(value+"의 절대값: "+abs(value));
	}
}
