package lec_16;

public class rec_6 {
	public static void main(String[] args) {
		int n = 4;
		PI(n);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}
}
