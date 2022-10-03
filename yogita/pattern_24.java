package yogita;

public class pattern_24 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tsp = n;
		int tst = 1;
		int num = row;
		while(row<=n) {
			int space = 0;
			while(space<tsp) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while(star<tst){
				System.out.print(num+" ");
				star++;
			}
			tst = tst + 2;
			tsp = tsp - 1;
			num++;
			row++;
			System.out.println();
		}
	}
}
