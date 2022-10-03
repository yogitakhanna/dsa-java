package yogita;

public class pattern_30 {
	public static void main(String[] args) {
		int i = 1, n = 5;
		int num = n;
		while(i<=n) {
			int j = 1;
			num = n;
			while(j<=n) {
				System.out.print(num+" ");
				num--;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
