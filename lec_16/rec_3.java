package lec_16;

//1 2 3 4 4 3 2 1 
public class rec_3 {
	public static void main(String[] args) {
		PID(1, 4);
	}

	public static void PID(int n, int m) {
//		if (n == 0) {
//			return;
//		}
//		B.P:PID(n,m)
//		S.P:PID(n+1,m)

		if (n > m) {
			return;
		}
		if (n <= m) {
			System.out.println(n);
			PID(n + 1, m);
			System.out.println(n);
		}
	}
}
