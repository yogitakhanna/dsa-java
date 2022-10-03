package yogita;

public class pattern_12 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		while(i<=n) {
			int j = 1, space = 1;
			while(space<=n-i) {
				System.out.print("  ");
				space++;
			}
			while(j<2*i ) {
				if(j%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
