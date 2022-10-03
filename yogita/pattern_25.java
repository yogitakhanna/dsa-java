package yogita;

public class pattern_25 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tsp = n;
		int tst = 1;
		int num = 1;
		while(row<=n) {
			int space = 0;
			while(space<tsp) {
				System.out.print("\t");
				space++;
			}
			int star = 0;
			while(star<tst){
				System.out.print(num+"\t");
				num++;
				star++;
			}
			tst = tst + 2;
			tsp = tsp - 1;
			row++;
			System.out.println();
		}
	}
}
