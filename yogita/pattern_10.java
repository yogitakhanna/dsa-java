package yogita;

public class pattern_10 {
	public static void main(String[] args) {
		int n=5;
		int i=1;
		while(i<=n) {
			int space = 1, j = 1;
			while(space <= i) {
				System.out.print(" ");
				space++;
			}
			while(j<=((n-i)+1)) {
				System.out.print("*");
				j++;
			}
			int k=n-1;
			while((i-1)<k) {
				System.out.print("*");
				k--;
			}
			System.out.println();
			i++;
		}
	}
}
