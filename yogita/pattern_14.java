package yogita;

public class pattern_14 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		while(i <= n) {
			int j = 1, space = 1;
			while(space <= (n - i)) {
				System.out.print(" ");
				space++;
			}
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		i = 1;
		while(i < n) {
			int j = n, space = 1;
			while(space <=  i) {
				System.out.print(" ");
				space++;
			}
			while(i < j) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}
	}
}
