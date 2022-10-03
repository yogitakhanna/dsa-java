package yogita;

public class pattern_17 {
	public static void main(String[] args) {
		int i = 1, n = 7;
		while(i <= n/2) {
			int j = 1, space = 1;
			while(j<=(n/2 - i+1)) {
				System.out.print("*");
				j++;
			}
			while(space<=(2*i - 1)) {
					System.out.print(" ");
					space++;
			}
			while(j<=(n - 2*i + 1)) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		while(i < n/2) {
			int j = 1, space = 1;
			while(j<=(n/2 - i+1)) {
				System.out.print("*");
				j++;
			}
			while(space<=(2*i - 1)) {
					System.out.print(" ");
					space++;
			}
			while(j<=(n - 2*i + 1)) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
