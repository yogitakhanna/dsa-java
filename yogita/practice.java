package yogita;
	import java.util.Scanner;
	public class practice {
		public static void main(String args[]) {
			// Your Code Here
			Scanner scn = new Scanner(System.in);
			int num = scn.nextInt();
			int ans = 0;
			while(num>0){
				
				int digit = num % 10;
				if( digit > 0 && digit < 5) {
					ans = digit;
					System.out.print(ans);
				}
					else if(digit > 4){
					digit = 9 - digit;
					System.out.print(digit);
				}
				
				num = num / 10;
			}
		}
	}
	
