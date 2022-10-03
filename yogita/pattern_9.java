package yogita;

public class pattern_9 {
	public static void main(String[] args) {
		int n=5;
		int i=1;
		while(i<=n) {
			int j=1, space=1;
			while(space<=(n-i)) {
				System.out.print(" ");
				space++;
			}
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			int k=0;
			while(k<(i-1)) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		
	}

}
