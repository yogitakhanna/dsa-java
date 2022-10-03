package yogita;

public class pattern_8 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		while(i<=n) {
			int j = 0;
			while(j<=n) {
				if(j==(i-1) || (i+j)==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
