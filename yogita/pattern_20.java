package yogita;

public class pattern_20 {
	public static void main(String[] args) {
		int row = 1, n = 15;
		int tsp = n/2;
		int tst = 1;
		while(row <= n) {
			int  space = 0;
			while(space<tsp) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while(star<tst) {
				if(star==0||star==tst-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				star++;
			}
			if(row<=n/2) {
				tst = tst + 2;
				tsp = tsp - 1;
			}
			else {
				tst = tst - 2;
				tsp = tsp + 1;
			}
			row++;
			System.out.println();
		}
	}
}
