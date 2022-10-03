package yogita;

public class pattern_13 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		i = 1;
		while(i<n) {
			int j = n;
			while(j>i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}
		
	}

}