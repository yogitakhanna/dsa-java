package yogita;

public class pattern_22 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		int tsp = 1;
		while(i <= n) {
			int j = n, space = 0;
			while(j>=i) {
				System.out.print("*");
				j--;
			}
			while(space<(2*tsp-3)) {
					System.out.print(" ");
					space++;
			}
			j=1;
			while(j<=((n-i)+1) && j!=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			tsp++;
			i++;
		}
	}
}
