package yogita;

public class pattern_21 {
	public static void main(String[] args) {
		int i = 1, n = 5, tst = n;
		while(i<=n) {
			int j = 0;
			while(j<i) {
				System.out.print("* ");
				j++;
			}
			int space = 2*tst-3;
			while(space>0) {
				System.out.print("  ");
				space=space-1;
				
			}
			j=0;
			while(j<i && j!=n-1) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			tst--;
			i++;
		}
	}
}
