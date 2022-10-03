package yogita;

import java.util.Scanner;
import java.util.Scanner;
public class pattern_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int tsp = n/2;
		int tst = 1;
		while(row <= n) {
			int  space = 0;
			while(space<tsp) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while(star<tst) {
				System.out.print("* ");
				star++;
			}
			if(row<=n/2) {
				tst = tst + 2;
				tsp = tsp - 1;
			}
			else {
				tst = tst - 2;
				tsp = tsp + 1;
			}
			row++;
			System.out.println();
		}
	}
}
