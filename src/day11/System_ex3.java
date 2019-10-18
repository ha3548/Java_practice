package day11;

public class System_ex3 {
	public static void main(String[] args) {
		String userName = System.getProperty("user.name");
		String userDir = System.getProperty("user.dir");
		
		System.out.println(userName);
		System.out.println(userDir);
	}
}
