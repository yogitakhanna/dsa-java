package yogita;

public class pattern_15 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		while(i <= n) {
			int j = n, space = 1;
			while(space <  i) {
				System.out.print("    ");
				space++;
			}
			while(i <= j) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			i++;
		}
		i = 2;
		while(i <= n) {
			int j = n, space = n;
			while(i < j) {
				System.out.print("    ");
				j--;
			}
			while( (n - i) < space) {
				System.out.print("* ");
				space--;
			}
			System.out.println();
			i++;
		}
	}
}
