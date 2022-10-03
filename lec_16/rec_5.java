package lec_16;

//   5 * 4 * 3 * 2 * 1
public class rec_5 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int sp = factorial(n - 1);
		return sp * n;
	}
}
