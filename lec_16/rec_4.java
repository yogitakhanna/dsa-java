package lec_16;

//   fibonacci
public class rec_4 {
	public static void main(String[] args) {
		System.out.println(fibonacci(4));
	}

	public static int fibonacci(int n) {
//		B.P : fib
//		S.P : fib(n-1)  fib(n-2)

//		B.S : fib(n-1) + fib(n-2)

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		int sp1 = fibonacci(n - 1);
		int sp2 = fibonacci(n - 2);

		return sp1 + sp2;
	}
}
