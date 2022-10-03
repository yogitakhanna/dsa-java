package yogita;

public class functions_3 {
	static int val = 100;
	
	public static void main(String[] args) {
		System.out.println(functions_3.val);
		fun(20);
	}
	
	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(functions_3.val);
		val = val + 60;
		functions_3.val = val + 10;
		System.out.println(val);
		System.out.println(functions_3.val);
	}
}
