package yogita;

public class pattern_29 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tsp = n;
		int tst = 1;
		int num = 1;
		while(row<=n) {
			int space = 0;
			while(space<tsp) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while(star<tst){
				if(star<=tst/2) {
					if(star==0||star==tst-1) {
						System.out.print(num+" ");
					}else {
						System.out.print("0 ");
					}
					num++;
				}
				else {
					if(star==0||star==tst-1) {
						System.out.print(num-2+" ");
					}else {
						System.out.print("0 ");
					}
					num--;
				}
				star++;
			}
			tst = tst + 2;
			tsp = tsp - 1;
			row++;
			System.out.println();
		}
	}
}
