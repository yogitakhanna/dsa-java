package yogita;

public class pattern_31 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		int num = n;
		while(i<=n) {
			int j = 1;
			num = n;
			while(j<=n) {
				if(i+j==6) {
					System.out.print("* ");
				}
				else {
					System.out.print(num+" ");
				}
				num--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
