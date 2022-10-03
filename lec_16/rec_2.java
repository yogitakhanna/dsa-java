package lec_16;

//    4 3 2 1 1 2 3 4
//   print decreasing increasing
public class rec_2 {
	public static void main(String[] args) {
		int n = 2;
		PDI(n);
	}

	public static void PDI(int n) {
//		if (n >= 1) {
//			System.out.println(n);
//			PDI(n - 1);
//			System.out.println(n);
//		}

		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}
}
