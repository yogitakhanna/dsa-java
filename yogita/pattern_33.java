package yogita;

public class pattern_33 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int tsp = n-1;
		int tst = 1;
		int num = 1;
		int st_row = n;
		while(row<=n) {
			int space = 0;
			while(space<tsp) {
				System.out.print("\t");
				space++;
			}
			num = st_row;
			int star = 0;
			while(star<tst) {
				if(num==n) {
					System.out.print(0+"\t");
				}
				else {
					System.out.print(num+"\t");
				}
				if(star<tst/2) {
					num++;
				}
				else {
					num--;
				}
				star++;
			}
			tst = tst + 2;
			tsp = tsp - 1;
			st_row--;
			row++;
			System.out.println();
		}
	}
}
