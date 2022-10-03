package yogita;
import java.util.Scanner;
public class practice_3 {
	public static void main(String[] args) {
        // Your Code Here
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int n = 1, flag = 1;
		while(n < num - 2) {
			int a,b;
			n = scn.nextInt();
			a = ; b = + 1;
			int d = b - a ;
			
			if(d<0) {
				flag = 0;
			}
			else if(d>0) {
				flag = 1;
			}
			else {
				if(a>0) {
					flag = 1;
				}
				else {
					flag = 0;
				}
				n++;
			}
		}
		if(flag == 1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}

