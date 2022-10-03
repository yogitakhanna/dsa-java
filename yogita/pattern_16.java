package yogita;

public class pattern_16 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		while(i <= n) {
			int space = n;
			while(space>i) {
				System.out.print("  ");
				space--;
			}
			int j = n;
			while( i <= j ) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			i++;
		}
		i = 2;
		while(i <= n) {
			int space = 0;
			while(space<i-1	) {
				System.out.print("  ");
				space++;
			}
			int j = 1;
			while( j <= i ) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
