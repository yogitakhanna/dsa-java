package lec_16;

//   4 3 2 1
public class rec_1 {
	public static void main(String[] args) {
		int n = 4;
		PD(n);
	}

	public static void PD(int n) {
//		if(n > 0) {
//			System.out.println(n);
//			PD(n - 1);
//		}
//			OR
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
	}
}
