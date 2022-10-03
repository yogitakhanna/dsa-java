package yogita;

public class pattern_4 {
	public static void main(String[] args) {
		int n=5;
		int i=1;
		while(i<=n) {
			int j = 1, space = 1;
			while(space <= (n - i)){
					System.out.print(" ");
					space++;
			}
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
