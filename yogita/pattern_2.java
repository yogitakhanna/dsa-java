package yogita;

public class pattern_2 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tst = n;
		while (row <= n) {
			int star = 0;
			while (star < tst) {
				System.out.print("* ");
				star++;
			}

			System.out.println();
			row++;
			tst--;
		}
	
	}
}
