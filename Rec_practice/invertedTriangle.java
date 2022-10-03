package Rec_practice;

public class invertedTriangle {
	public static void main(String[] args) {
		int n = 5;
		invertedTriangle(n);
	}

	public static void invertedTriangle(int n) {
		if (n == 0) {
//			System.out.print("*");
			return;
		}
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
			invertedTriangle(n-1);
	}
}
